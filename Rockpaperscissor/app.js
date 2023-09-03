// 获取游戏中的元素
const userScoreElement = document.getElementById("user-score");
const computerScoreElement = document.getElementById("computer-score");
const userLabel = document.getElementById("user-label");
const computerLabel = document.getElementById("computer-label");
const resultMessage = document.querySelector(".result p");
const choices = document.querySelectorAll(".choice");
const actionMessage = document.getElementById("action-message");

// 初始化分数
let userScore = 0;
let computerScore = 0;

// 生成计算机的随机选择
function getComputerChoice() {
    const choices = ["r", "p", "s"];
    const randomIndex = Math.floor(Math.random() * 3);
    return choices[randomIndex];
}

// 将选择转换成单词形式
function convertToWord(choice) {
    if (choice === "r") return "Rock";
    if (choice === "p") return "Paper";
    return "Scissors";
}

// 用户选择事件处理程序
function userChoiceHandler(userChoice) {
    const computerChoice = getComputerChoice();
    const result = determineWinner(userChoice, computerChoice);
    updateUserInterface(userChoice, computerChoice, result);
}

// 判断获胜者
function determineWinner(userChoice, computerChoice) {
    if (userChoice === computerChoice) {
        return "It's a draw!";
    } else if (
        (userChoice === "r" && computerChoice === "s") ||
        (userChoice === "s" && computerChoice === "p") ||
        (userChoice === "p" && computerChoice === "r")
    ) {
        userScore++;
        return "You win!";
    } else {
        computerScore++;
        return "You lost!";
    }
}

// 更新用户界面
function updateUserInterface(userChoice, computerChoice, result) {
    userScoreElement.textContent = userScore;
    computerScoreElement.textContent = computerScore;
    userLabel.classList.remove("winner", "loser");
    computerLabel.classList.remove("winner", "loser");

    if (result === "You win!") {
        userLabel.classList.add("winner");
        computerLabel.classList.add("loser");
    } else if (result === "You lost!") {
        computerLabel.classList.add("winner");
        userLabel.classList.add("loser");
    }

    resultMessage.textContent = `${convertToWord(userChoice)} vs ${convertToWord(
        computerChoice
    )}. ${result}`;
}

// 为每个选择添加点击事件监听器
choices.forEach((choice) => {
    choice.addEventListener("click", () => {
        const userChoice = choice.id;
        userChoiceHandler(userChoice);
    });
});

// 初始化游戏
function initGame() {
    userScore = 0;
    computerScore = 0;
    userScoreElement.textContent = "0";
    computerScoreElement.textContent = "0";
    resultMessage.textContent = "Make your move.";
    actionMessage.textContent = "Click on a choice to play!";
    userLabel.classList.remove("winner", "loser");
    computerLabel.classList.remove("winner", "loser");
}

// 初始化游戏
initGame();
