terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "5.16.1"
    }
  }
}

provider "aws" {

  region = "us-east-1"
  # Configuration options
}

data "aws_vpc" "default_vpc"{
  default = true
}

resource "aws_vpc" "demo_vpc"{

  cidr_block = "10.0.0.0/16"
}

resource "aws_instance" "ec2-instance-a" {
  
  ami = "ami-01c647eace872fc02"
  instance_type = "t2.micro"
  vpc_security_group_ids = [aws_security_group.http_traffic.id]
  user_data = file("./server-startup.sh")

  tags = {
    Name = "EC2-Instance-A-Terraform"
  }
}

resource "aws_eip" "ec2-a-eip" {
  
  instance = aws_instance.ec2-instance-a.id
}

variable "ports" {

  type = list(number)
  default = [ 80, 8080, 443, 8761]
}

variable "egress_ports" {

  type = list(number)
  default = [ 80, 8080, 443, 8761, 9999, 12345]
}

// 

resource "aws_security_group" "http_traffic"{

  name = "This SG allows https traffic"

  dynamic "ingress" {

    for_each = var.ports
    iterator = port

    content {
      cidr_blocks = ["0.0.0.0/0"]
      from_port = port.value
      protocol = "TCP"
      to_port = port.value
    }
  }

  dynamic "egress" {

    for_each = var.egress_ports
    iterator = egress_port

    content {
      cidr_blocks = ["0.0.0.0/0"]
      from_port = egress_port.value
      protocol = "TCP"
      to_port = egress_port.value
    }
  }

}
# output 
