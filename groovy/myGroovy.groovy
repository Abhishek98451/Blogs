folder('myProject')
job('myProject/Blogs'){
  
    steps {
        
       shell( "ansible-playbook runsetup.yml")
    }
   
    
}
