# GIT-PROJECT
### for the owner **medyassine-bensaid**

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

### For Collaborators:

3. **Clone the GitHub Repository:**
   - Make sure you have a GitHub account and have been added as a collaborator to the repository by the owner #DONE
   - Clone the repository to your local machine using the following command:
     ```
     git clone  https://github.com/medyassine-bensaid/GIT-PROJECT.git
     ```

4. **Navigate to the Project Directory:**
   - Change to the project directory:
     ```bash
     cd /src
     ```

5. **Create a New Branch:**
   - Create a new branch from the `main` branch:
     ```
     git checkout -b feature-branch-name
     ```

6. **Add a Java Class:**
   - Create or edit a Java class in your project directory using a code editor.
   - Stage the changes for commit:
     ```
     git add <filename.java>
     ```
   - Commit your changes with a meaningful message:
     ```
     git commit -m "Add a new Java class"
     ```

7. **Push Changes to Your Branch:**
   - Push your branch to the remote repository:
     ```
     git push origin feature-branch-name
     ```
Certainly, here's a simplified way to merge a feature branch into the main branch and resolve conflicts using command-line interface (CLI) commands:

### For Both Repository Owner and Collaborators:

** Merge into Main Branch and Resolve Conflicts**


1. **Switch to the main branch:**
   ```
   git checkout main
   ```

2. **Merge your feature branch into the main branch:**
   ```
   git merge feature-branch
   ```

3. **Resolve any conflicts that may arise during the merge.**

4. **Commit the merge with an appropriate message:**
   ```
   git commit -m "Merge feature-branch into main"
   ```

5. **Push the changes to the main branch on GitHub:**
   ```
   git push origin main
   ```
