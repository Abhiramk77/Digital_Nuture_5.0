# GitHub Workflow Guide

## Initial Git Configuration
Configure your user name and email (replace with your details):
```bash
git config --global user.name "Abhiramk77"
git config --global user.email "abhiram.k@example.com"
```

## Initializing Git and Uploading
Follow these steps from the root workspace directory `DigitalNurture_AbhiRam/` to push your code:

1. **Initialize Git repository**:
   ```bash
   git init
   ```

2. **Add all files**:
   ```bash
   git add .
   ```

3. **Commit changes**:
   ```bash
   git commit -m "Initial commit: Complete Digital Nurture 5.0 project for Abhi Ram"
   ```

4. **Rename main branch (optional but recommended)**:
   ```bash
   git branch -M main
   ```

5. **Link the remote repository**:
   ```bash
   git remote add origin https://github.com/Abhiramk77/Digital_Nuture_5.0.git
   ```

6. **Push code to GitHub**:
   ```bash
   git push -u origin main
   ```
