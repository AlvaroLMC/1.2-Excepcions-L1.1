# Project: Sales Management System  
  
## Description    
This project is a Java exercise that simulates a sales management system. The following classes have been created:  
  
- **Product**: Represents a product with two attributes: `name` (name) and `price` (price).    
- **Sale**: Represents a sale, composed of a list of products and a total calculated as the sum of the prices of those products. The class includes the `perform()` method, which checks that the product list is not empty. If the list is empty, it throws a custom exception, `EmptySaleException`, and displays the message "Empty list, sale cannot be made!" on the screen.    
- **EmptySaleException**: A custom exception that extends `Exception` (a standard Java class) and is used to indicate that a sale cannot be made without products.    
  
Additionally, the example includes the generation and handling of an `IndexOutOfBoundsException` to demonstrate the management of common errors in Java.  
  
## Technologies Used    
- **Java** (JDK 8 or higher)  
  
## Requirements    
- JDK 8 (or higher) must be installed.    
- A text editor or IDE (for example, IntelliJ IDEA, Eclipse, or NetBeans) to compile and run the code.  
  
## Installation    
1. Clone this repository or download the file containing the source code.    
2. Open the project in your preferred IDE or working directory.    
3. Verify that the `JAVA_HOME` environment variable points to the installed JDK.
