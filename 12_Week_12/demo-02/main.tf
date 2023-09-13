
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


  // EC2 Module Invoke
  module "ec2_instance_db_invoker"{
    source = "./ec2"
    ec2_instance_display_name = "DB-Server"
  }

  // EC2 Module Invoke
  module "ec2_instance_web_invoker"{
    source = "./ec2"
    ec2_instance_display_name = "Web-Server"
  }


output "ec2_public_ip_db_server" {
  value = module.ec2_instance_db_invoker.ec2_instance_public_ip
}

output "ec2_public_ip_web_server" {
  value = module.ec2_instance_web_invoker.ec2_instance_public_ip
}

output "ec2_private_ip_db_server" {
  value = module.ec2_instance_db_invoker.ec2_instance_private_ip
}

output "ec2_private_ip_web_server" {
  value = module.ec2_instance_web_invoker.ec2_instance_private_ip
}

// EC2 Instance - DB-Server [p1, p2]
// outputs / return values

// EC2 Instance - Web-Server[p1, p2]

