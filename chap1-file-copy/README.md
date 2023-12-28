# HOW IT WORKS
This module copy just the file from **eip-files/inbox** into **eip-files/outbox**.

Requirements:
- Copy the file from source into destination
- Do not remove the file from the source when copied!

# HOW TO RUN
1. Build

    Excute into the directory of this file this command: 
    ```
   mvn clean package
   ```

3. Run
    ```
   java -jar target/file-copy-1.0.0.jar
   ```

4. Test

    Create or copy a file into **data/inbox** directory and the app will copy those files into **data/outbox**