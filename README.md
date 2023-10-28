# GIT-PROJECT
## for the owner **medyassine-bensaid**

1. **Create the GitHub Repository:**
   - Go to GitHub and log in to your account.
   - Click the "+" sign in the upper right corner and choose "New Repository."
   - Fill in the repository details " GIT-PROJECT" and click "Create repository."

2. **Initialize a Git Repository Locally:**
   - On your local machine, navigate to the project directory or create a new directory if needed.
   - Initialize a new Git repository using the following command:
     `git init`    

3. **Add Files to the Repository:**
   - Create or add the project files to the local repository directory.
   - Add the files to the staging area using the following command:
     `git add .`
   - This command stages all changes in the directory. You can also specify individual files to stage.

4. **Commit Changes:**
   - Commit the staged changes with a meaningful message:
  `git commit -m "java project`

5. **Connect the Local Repository to the GitHub Repository:**
   - Create a remote connection to your GitHub repository :
   `git remote add origin https://github.com/medyassine-bensaid/GIT-PROJECT.git`

6. **Push the Initial Commit to the Main Branch on GitHub:**
   - Push your changes to the main branch on GitHub:
 
`git push -u origin main`

   - The `-u` flag sets up a tracking relationship between your local `main` branch and the remote `main` branch on GitHub, which allows you to use `git push` and `git pull` without specifying the remote and branch every time.
