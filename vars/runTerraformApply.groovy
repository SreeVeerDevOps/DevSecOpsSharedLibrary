def call(String tfvars = 'dev.tfvars') {
  echo "Running Terraform Code...."
  sh "terraform version"
  sh "terraform init && terraform fmt && terraform validate"
  sh "terraform apply --var-file ${tfvars} --auto-approve"
}
