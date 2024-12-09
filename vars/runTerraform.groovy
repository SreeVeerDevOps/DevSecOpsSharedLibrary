def call(String name = 'human') {
  echo "Running Terraform ${name}"
  sh "terraform ${name}"
  sh "terraform init && terraform fmt && terraform validate"
}
