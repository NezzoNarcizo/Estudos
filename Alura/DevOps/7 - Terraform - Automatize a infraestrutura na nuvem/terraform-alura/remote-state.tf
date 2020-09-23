terraform {
  backend "remote" {
    hostname = "app.terraform.io"
    organization = "terraformAluraLabs"

    workspaces {
      name = "aws-aluraterraform"
    }
  }
}