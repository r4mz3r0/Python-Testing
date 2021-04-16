import unittest
class HelloWorld(object): 
  def hello(self, name):
    value = "Hello Tester {0}".format(name)
    return(value)

class HelloWorldTest(unittest.TestCase): 
  def test_name_ramiro(self):
    helloTest = HelloWorld() 
    val = helloTest.hello("Ramiro")
    self.assertEqual("Hello Tester Ramiro", val); 
    
if __name__ == "__main__": 
  unittest.main()
