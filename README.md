# Advanced JWT Manipulator - Burp Suite Extension

A custom, high-performance Burp Suite extension built with the modern [Montoya API](https://portswigger.net/burp/extensibility/montoya). 

## 📖 The Problem
Pentesters spend countless hours inside Burp Suite manually manipulating traffic. When dealing with complex encoding methods or custom JWTs, manual modification becomes a tedious bottleneck. This extension aims to automate the tedious decryption, modification, and re-encryption of custom JWTs, allowing testers to focus on finding vulnerabilities rather than wrestling with formatting.

## ✨ Features
* **Modern API:** Built strictly using the new, performant PortSwigger Montoya API.
* **Non-Blocking UI:** Features a clean, custom Java Swing UI integrated directly into Burp's tab interface.
* **Heavy Multithreading:** Core processing logic is heavily multithreaded. Background tasks run independently, ensuring the main Burp Suite instance never hangs or crashes during intensive operations.

## 🛠️ Prerequisites
To build and run this extension, you will need:
* [Burp Suite Professional or Community Edition](https://portswigger.net/burp)
* [Java Development Kit (JDK) 17+](https://adoptium.net/)
* [Gradle](https://gradle.org/install/) (Optional, but recommended. You can also rely on your IDE's built-in Gradle wrapper).

## 🚀 Building the Extension
This project uses Gradle to manage dependencies and package the extension into a "Fat JAR" (a standalone file containing all required libraries).

1. Clone the repository:
   ```bash
   git clone [https://github.com/yourusername/burp-jwt-manipulator.git](https://github.com/yourusername/burp-jwt-manipulator.git)
   cd burp-jwt-manipulator
   ```
2. Build the project using Gradle:
   ```bash
   gradle build
   ```
   Note: This will download the Montoya API dependencies and compile the code.
3. Locate the compiled extension:
Once the build is successful, you will find the generated .jar file in the following directory:
build/libs/burp-jwt-manipulator-1.0-SNAPSHOT.jar

📥 Installation in Burp Suite
Open Burp Suite.

Navigate to the Extensions tab.

Click the Add button in the top left.

Set the Extension type to Java.

Under Extension file (.jar), click Select file ... and choose the burp-jwt-manipulator-1.0-SNAPSHOT.jar you built in the previous step.

Click Next. You should see a "Extension loaded successfully!" message in the Output tab.

💻 Usage
Once loaded, a new tab labeled "JWT Tool" will appear in the main Burp Suite interface.

Navigate to the JWT Tool tab.

Configure your specific parameters (if applicable).

Click "Start Multithreaded Scan" to execute the background processing.

Check the Burp Extension Output logs for status updates and results.

🤝 Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

```bash
### Next Steps:
Now that your repository has its code and documentation, your next focus should be on building out the actual core logic inside `JwtProcessor.java` (which you will call from the background thread in your UI provider). 

What specific JWT manipulation technique are you planning to tackle first? Let me know if you need help designing the logic for it.
```
