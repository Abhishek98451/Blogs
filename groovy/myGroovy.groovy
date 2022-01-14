folder('myProject')
job('myProject/Blogs'){
  
    steps {
        
       shell( "echo 'hi'")
    }
    steps{
        shell('ls')
    }
    
}
