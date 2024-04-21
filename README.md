# EduTech
Online Learning platform Backend  Using Java , Spring Boot,Mysql 

##Database Schema

The database schema in edutech includes the following tables:

user

    id (bigint): Primary key
    email (varchar): User's email address
    enabled (bit): Flag indicating if the user is enabled
    f_name (varchar): User's first name
    lname (varchar): User's last name
    password (varchar): User's password
    phone (varchar): User's phone number
    profile (varchar): User's profile image URL
    user_name (varchar): User's username

question

    ques_id (bigint): Primary key
    answer (varchar): Correct answer to the question
    content (varchar): Question content
    image (varchar): URL of any associated image
    option1 to option4 (varchar): Options for the question
    quiz_qid (bigint): Foreign key referencing the quiz to which the question belongs

category

    cid (bigint): Primary key
    description (varchar): Description of the category
    title (varchar): Title of the category

quiz

    qid (bigint): Primary key
    active (bit): Flag indicating if the quiz is active
    description (varchar): Description of the quiz
    max_marks (varchar): Maximum marks for the quiz
    no_of_questions (varchar): Number of questions in the quiz
    title (varchar): Title of the quiz
    category_cid (bigint): Foreign key referencing the category of the quiz

result

    result_id (int): Primary key
    correct_ans (int): Number of correct answers
    marks_scored (double): Marks scored by the user
    q_attempted (int): Number of questions attempted
    submit_date_time (varchar): Date and time of result submission
    quiz_qid (bigint): Foreign key referencing the quiz for which the result is generated
    user_id (bigint): Foreign key referencing the user who took the quiz

role

    role_id (bigint): Primary key
    role_name (varchar): Name of the role
