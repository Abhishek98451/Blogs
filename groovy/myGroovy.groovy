folder('myProject')
job('myProject'){
  
    steps {
        
       shell( "echo 'hi'")
    }
    steps{
        shell('ls')
    }
    
}
