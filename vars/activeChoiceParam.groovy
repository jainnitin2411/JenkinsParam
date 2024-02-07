def call() {
  //println "full_string"
   def fruitTypes = ['APPLE', 'BANANA', 'ORANGE']
 
    return '''
        // Use JavaScript for the active choice script
        var fruitTypes = %s;
        return fruitTypes;
    ''' % fruitTypes.inspect()
  
}
