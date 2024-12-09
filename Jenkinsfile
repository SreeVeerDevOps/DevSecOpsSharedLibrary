@Library('terraform-shared-library') _
pipeline {
    agent any
    stages {
        stage('Creating Workspaces') {
            steps {
                echo 'Creating Workspaces Dev UAT & Prod'
                createWorkspace 'dev'
            }
        }
        stage('Deploying To DEV Environment') {
            steps {
                echo 'Deploying To DEV Environment..'
                sayHello 'MEGASTAR'
                createWorkspace 'dev'
                runTerraformPlan 'dev.tfvars'
            }
        }
        stage('Deploying To UAT Environment') {
            steps {
                echo 'Deploying To UAT Environment..'
                sayHello 'MEGASTAR'
                runTerraformPlan 'uat.tfvars'
            }
        }
        stage('Deploying To PROD Environment') {
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                runTerraformPlan 'prod.tfvars'
            }
        }
    }
}