folder('myProject')
job('myProjectSeed/myProject'){
  
    steps {
        
       shell( "cd /etc/ansible/roles")
    }
    steps{
        shell('ansible-galaxy init motd')
    }
    
}
