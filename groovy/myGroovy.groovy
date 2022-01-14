folder('myProject')
job('myProjectSeed/myProject'){
  
    steps {
        
       shell( "echo 'hi'")
    }
    steps{
        shell('echo "Hello"')
    }
    
}
