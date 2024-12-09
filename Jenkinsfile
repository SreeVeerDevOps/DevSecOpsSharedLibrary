@Library('terraform-shared-library') _
pipeline {
    agent any
    stages {
        stage('Creating Workspaces') {
            steps {
                echo 'Creating Workspaces Dev UAT & Prod'
                createWorkspace
            }
        }
        stage('Deploying To DEV Environment') {
            steps {
                echo 'Deploying To DEV Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'dev.tfvars'
            }
        }
        stage('Deploying To UAT Environment') {
            steps {
                echo 'Deploying To UAT Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'uat.tfvars'
            }
        }
        stage('Deploying To PROD Environment') {
            steps {
                echo 'Deploying To PROD Environment..'
                sayHello 'MEGASTAR'
                runTerraform 'prod.tfvars'
            }
        }
    }
}