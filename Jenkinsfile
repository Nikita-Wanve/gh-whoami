/*
 See the documentation for more options:
 https://github.com/jenkins-infra/pipeline-library/
*/
buildPlugin(useContainerAgent: true)


pipeline{
    agent any
    
    stages {
        stage('compile stage'){
       	 steps{
        		withMaven(maven:'maven_3_8_6'){
        		sh 'mvn clean compile'
        		}
         }
      	}
        stage('Testing stage'){
       	 steps{
        		withMaven(maven:'maven_3_8_6'){
        		sh 'mvn clean compile'
        		}
         }
      	}
      	stage('Deployment stage'){
       	 steps{
        		withMaven(maven:'maven_3_8_6'){
        		sh 'mvn clean compile'
        		}
         }
      	}
    }
}
        
        
            
     

        	
            
            
       
  
        	    
        	    
        	


