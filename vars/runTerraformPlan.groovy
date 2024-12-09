def call(String tfvars = 'dev.tfvars') {
  echo "Running Terraform Code...."
  sh "terraform version"
  sh "terraform init && terraform fmt && terraform validate"
  sh "terraform plan --var-file ${tfvars}"
}
