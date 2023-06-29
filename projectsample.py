quiz_questions = {
    "Round 1": {
        "question": "The capital of France is Paris.",
        "answer": True
    },
    "Round 2": {
        "question": "The largest ocean in the world is the Atlantic Ocean.",
        "answer": False
    },
    "Round 3": {
        "question": "The tallest mammal is the elephant.",
        "answer": False
    },
    "Round 4": {
        "question": "The currency of Japan is the yen.",
        "answer": True
    },
    "Round 5": {
        "question": "The planet closest to the sun is Mercury.",
        "answer": True
    }
}
import random

# initialize score
score = 0

# initialize user details
user_name = input("Enter your name: ")
user_age = input("Enter your age: ")

# shuffle the question
rounds = list(quiz_questions.keys())
random.shuffle(rounds)

# attempt quiz
for round in rounds[:5]:
    question = quiz_questions[round]["question"]
    answer = quiz_questions[round]["answer"]
    user_answer = input(f"{question} (T/F): ").lower() == "t"
    if user_answer == answer:
        print("Correct!")
        score += 1
    else:
        print("Incorrect.")

# display score and user details
print(f"{user_name}, {user_age} years old, scored {score} out of 5.")