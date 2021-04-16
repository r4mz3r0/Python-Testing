import unittest
class HelloWorld: 
  def hello(self, name):
    value = "Hello Tester {0}".format(name)
    print(value)

class HelloWorldTest(unittest.TestCase): 
  def test_name_ramiro(self): 
    val = HelloWorld("Ramiro")
    self.assertEqual("Hello Tester Ramiro", val); 
    
if __name__ == "__main__": 
  unittest.main()
