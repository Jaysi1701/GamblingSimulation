# Gambling Simulation Problem

## Overview

This project is a Java program that simulates a gambler who starts each day with a fixed amount of money and places bets until reaching either a winning target or a losing limit.

The project is implemented using Java programming concepts such as:

- Variables and Constants
- Methods
- If-Else Statements
- Loops
- Random Number Generation
- Git and GitHub Workflow

---

## Problem Statement

A gambler starts every day with:

- Stake = $100
- Bet Amount = $1 per game

The gambler continues betting until:

- Reaches $150 (50% profit), or
- Reaches $50 (50% loss)

This process is repeated for 20 days.

At the end of the month, the program calculates:

- Total amount won or lost
- Number of winning days
- Number of losing days
- Luckiest day
- Unluckiest day
- Whether to continue gambling next month or stop

---

## Use Cases Implemented

### UC1 - Initialize Stake

Gambler starts with $100 stake.

### UC2 - Win or Lose

Each bet results in:

- Win $1
- Lose $1

### UC3 - Daily Stop Condition

Stop playing for the day when stake reaches:

- $150
- $50

### UC4 - Monthly Profit/Loss

Calculate total money won or lost after 20 days.

### UC5 - Winning and Losing Days

Count total winning and losing days.

### UC6 - Luckiest and Unluckiest Day

Find:

- Day with maximum win
- Day with maximum loss

### UC7 - Continue or Stop Gambling

If monthly total is positive:

- Continue next month

Else:

- Stop gambling

---

## Technologies Used

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## Project Structure

```text
GamblingSimulation/
│── src/
│   └── gambling/
│       └── GamblingSimulator.java
│── README.md
