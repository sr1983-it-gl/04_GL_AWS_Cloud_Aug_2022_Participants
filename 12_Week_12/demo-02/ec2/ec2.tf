
variable "ec2_instance_display_name" {
  type = string
}

resource "aws_instance" "generic-ec2-instance" {
  
  ami = "ami-01c647eace872fc02"
  instance_type = "t2.micro"

  tags = {
    Name = var.ec2_instance_display_name
  }
}

output "ec2_instance_public_ip"{
  value =  aws_instance.generic-ec2-instance.public_ip
}

output "ec2_instance_private_ip"{
  value =  aws_instance.generic-ec2-instance.private_ip
}

