# CMPSC 100-03 Practical Session 5

This practical engages with concepts underpinning the use of `method`s and `class`es in Java. In particular, today you will work with the `Random` class, `Scanner` class, their methods, and an additional method identified by the `encounterReport` identifier. 

* Assigned: Friday, 27 September 2019
* Due: Monday 30 September 2019
* Point value: 15 points

# General guidelines for practical sessions

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Table of Contents

* [Cloning your repository](#cloning-your-repository)
* [Slack](#slack)
* [Github](#github)
* [HumanQuest: Part 1](#humanquest-part-1)
* [GatorGrader](#gatorgrader)
* [`commit` your work](#commit-your-work)

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## HumanQuest: Part 1

All across the Gator Kingdom, gators have become obsessed with "HumanQuest," a game in which gator-kind attempts to role-play situations from the human world which are _as boring and mundane as possible_. These include the perils of office small talk, engaging in fierce office politics battles, and various encounters with formidable office woes.

The game is played with different dice, but when doing battle with office supplies, the game requires that players roll a 13-sided die. (Of course, this kind of thing is only possible in the Gator World.) As luck would have it, the game is so popular that all of the dice have sold out.

G. Wiz and friends have started to explore ways that they can play the game without having the dice they need to play, and this program is one attempt to solve their problem.

### The given situation

You've been given code that represents as far as the gators have gotten with their solution. While they know, in principle, what they need to do to complete it, they're all busy gators. If someone else can finish this program for them either before or on the weekend, they can plan the game.

While code outside of the following block needs completed, pay attention to where the bulk of the work has to take place:

```java
    // TODO Perform first encounter
    String encounter = // Get encounter title
    int checkRoll = // Get value for check roll
    scanner.nextLine(); // Move scanner along
    int result = // Make 13-sided die roll
    /*
     * TODO Display the encounterReport
     */
    // TODO Perform next encounter
    encounter = // Get encounter title
    checkRoll = // Get value for check roll
    result = // Make 13-sided die roll
    // Display the encounterReport
    /*
     * TODO Display the encounterReport
     */
```

Note that _all variable identifiers_ have been given to you but the methods and other statements that need to come into play are missing. It's up to you to:

* Read the file initialized with the scanner and implement the appropriate methods to get the requested values.
    * This may require opening the input file to look at its format.
* Use the above-retrieved values to populate the variables
* Use the `Random` class to make two (2) rolls of the 13-sided die.
    * Remember that Java is a 0-indexed language. What does this mean for our rolls?

### The finished product

- [ ] A single file, `EncounterCheck.java` which builds and runs successfully
- [ ] Implements the `java.util` class for providing the `Scanner` class
- [ ] Contains the correct amount of `scanner` methods for retrieving correct information
- [ ] Uses the `Random` class to perform two 13-sided die rolls
- [ ] Contains two (2) calls to the `encounterReport` method
- [ ] Command output matching the following exactly:
```
To defeat the paper jam:
Gator needed to roll    12
Gator's actual roll     9
To defeat the typo avalanche:
Gator needed to roll    100
Gator's actual roll     6
```
* **Hint:** This uses a control character
- [ ] Removes all `TODO` statements
- [ ] Replaces any other `{}` placeholders with appropriate replacements
- [ ] Repository has two (2) `commit`s

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it:

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`
