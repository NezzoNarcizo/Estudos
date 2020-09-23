variable "amis" {
    type = map(string)
    default = {
        us-east-1 = "ami-02354e95b39ca8dec"
        us-east-2 = "ami-07c8bc5c1ce9598c3"
    }
}

variable "cdirs_acesso_remoto" {
    type = list(string)
    default = ["177.5.255.105/32"]
}

variable "key_name" {
    default = "terraform-aws"
}