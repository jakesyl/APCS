

Jake Sylvestre

Thursday August 29th, 2015

* Computer programs are composed of primitive operations
* Examples of primitive operations:
 * Put a red dot onto this screen position
 * Send the letter A to the printer
 * Add up two numbers
 * etc.
* Programs contain a huge number of operations
* Anatomy of a computer
 * CPU
   * The central proccesing unit handles all the operations and contains transistors.
   * Memory
     * Volatile
       * RAM or random access memory is a form of memory that is volatile. Volatile memory goes away when the power is pulled. It is also faster and contains instructions for the cpu.
     * Non volatile
       * Hard Drive
       * SSD
     * Removable storage
       * Cd drive
       * floppy drive
       * USB 2.0/3.0
   * Networking
     * Computers are sometimes connected to networks through phone lines or fiber optics
   * HID
     * HID’s are human interface devices
     * they are connected through ports
     * they help a user interact with the CPU, Ram and other components of a pc
   * Data and programs are stored in primary storage and secondary storage
   * The cpu reads machine instructions from memory. The instructions direct it to communicate memory, secondary storage, and peripheral devices
 * Random Fact 1.1
   * The ENIAC (electronic numerical integrator and computer) was the first usable electronic computer
   * Invented at Upenn
   * ran on vacuum tubes
 * Translating human readable programs into machine code
 * Java programs run in a JVM
 * JVM’s virtualize ideal cpus for portability.
 * Machine instructions are encoded so they can be stored in memory
 * Because machine instructions are encoded as numbers it is difficult to write programs in machine code
 * High-level languages allow you to describe tasks at a higher conceptual level than machine code
 * A compiler translates programs written in a high level language to machine code
 * Java Programming Language
   * Designed for portability
   * Secure
 * Eclipse is an ide:
   * Integrated development environment
   * Prevents you from interacting with shell
   * GUI displays file structure
   * You must save your work
   * Back up your code!
   * Compiling: hit run, or in unix use “javac program.java && java program.java”
 * Comments help readers understand your program
 * Method is called by specifying an object, method name, and parameters.
 * A string is a sequence of characters enclosed in quotation marks
 * A syntax error is a violation of the rules of the programming language. Compilers detect syntax errors
 * Logical error causes a program to take an action that a programmer did not intend.
 * Common errors include misspelling words
* In class notes:
 * Prerequisites
   * Computer saavy (file management, text editing)
   * Problem solving skills
   * Time management
   * High school math
   * No prior programming required
 * What do computers do?
   * Organizing and writing term papers
   * Help balance checkbook
   * Keep track of grades
   * They are good game machines
 * How do computers do it?
   * Computers must be programmed to perform tasks. Different task require different programs.
   * A computer program executes a sequence of very basic operations in a very fast amount of time.
 * What is a computer?
   * CPU
   * Memory
   * Peripherals
   * Executes instructions
   * Executes instructions rapidly
   * General purpose device




   * Chapter 1.7 Errors
    * Syntax Errors
      * Syntax errors are a violation of the rules of a programming language
      * Syntax errors are compile time errors.
    * Logic Errors/Run time errors
      * A logic error causes a program to take an action that the programmer did not intend. You must test your programs to find logic errors.
    * Self Check:
      * Suppose you omit the // characters from the HelloPrinter.java program but not the raminder of the coment. Will you get a compile-time error or a run-time error.?
        * You will get a compile time error
      * How you can find logic errors in a program?
        * Expecting an output based on an input and running the program with that given output
   * Chapter 1.8 The Compilation Process
    * An editor is a program for entering and modifying text such as a Java Program.
    * The Java compiler translates source code into class files that contain instructions from the Java virtual machine.
    * Source Code- statements you write are in class files.
    * System and Println Stream classes have implemented all necessary actions and placed the required class into a library.
   * Self Check:
    * What do you expect to see when you load a class file into your text editor?
      * You can expect to see source code.
    * Why can’t you test a program for run-time errors when it has compiler errors?
      * You can only test a program for run time errors if it is executed.



      Self Check



      1. 1-1
       1. What is required to play a music CD on a computer?
         1. An optical disk drive
         1. A program to read the input of the optical disk drive
         1. An output device, such as speakers or headphones
       1. Why is a cd player less flexible than a computer?
         1. a CD player serves one function, to read data off cds. Computers can manipulate this data in any number of ways.
      1. 1.2
       1. Where is the program stored when it is not currently running?
         1. The program is stored in nonvolatile memory. Also known as secondary storage
       1. Which part of the computer carries out arithmetic operations, such as addition and multiplication?
         1. The cpu carries out these arithmetic operations. More specifically a component of the CPU called the AMU or the arithmetic processing unit.
      1. 1.3
       1. What is the code for the Java virtual machine instruction “Load the contents of memory location 100”?
         1. The code for the JVM instruction “Load the contents of memory location 100” is 21 40.
       1. Does a person who uses a computer for office work ever run a compiler?
         1. A person who uses a computer for office work does use a compiler, but not directly. Many commonly used programming languages such as python do on the fly compilation.
      1. 1.4
       1. What are the two most important benefits of the Java Language?
         1. Portability
         1. Security
       1. How long does it take to learn the entire Java library?
         1. No one can hope to learn the entire java library, it’s infeasible.
      1. 1.5
       1. How are programming projects stored on a computer?
         1. Programming projects on a computer are stored as source code in folders and files.
       1. What do you do to protect yourself from data loss when you work on programming projects?
         1. In order to protect against data loss you can do a variety of things. You can back them up to any number of mediums. Additionally you can use a revision control program with a remote server such as SVN, CSV, or git. Git is especially useful because the entire repository, including history is backed up on your computer, the git server and any other machines cloning the project.
      1. 1.6
       1. How would you modify the HelloPrinter program to print the words “Hello,” and “World!” on two different lines?
         1. I would add a “\n” in between the two words I wanted on seperate lines.
       1. How would the program continue to work if you omitted the line starting with //?
         1. The program would continue to work if I ommited the line starting with //
       1. What does the following set of statements print?
         1. The following set of statements print “My lucky number is 12”.
      1. Page 29 R1.1-R1.3

      R1.1: The difference between a computer program and programming a computer is that a computer program executes an operations or a series of functions. It does not modify the computer outside of what the programmer told it to. Programming a computer creates executable files that can modify the behavior of a computer to perform a series of a functions.



      R1.2: A computer is different from a household appliance in that a household appliance does only one thing, whereas a computer can be programmed to do a variety of things.



      R1.3 The various parts of a computer can be ranked by certain paramaters such as Speed, Cost, and Storage capacity. A CPU has the best speed, the highest cost and the lowest storage capacity. RAM has the second highest cost, the second highest cost and the second highest storage capacity. ROM such as a hard drive has the lowest speed, the lowest cost, and the highest storage capacity.
