# Inventory Feature Practice (Java)

## 📖 About

This project was created to practice implementing an **Inventory** feature in an existing Java OOP application.

Instead of building an application from scratch, the goal is to understand how developers work on real projects by extending an existing codebase with a new business requirement.

This type of exercise is commonly seen in pair programming interviews where candidates are asked to add a new feature to an existing application.

---

## 🎯 Objective

The existing project contains:

- Item
- Store
- Main

The task is to enhance the application by adding **Inventory Management** functionality.

---

## 📂 Existing Project

The original project contains the following classes:

```
Item.java
Store.java
Main.java
```

The original `Item` class contains:

- Item ID
- Item Name
- Price

The project can add items to a store and display them.

---

## 🚀 Feature Request

The store owner now wants to maintain inventory information for every item.

Implement the following tasks.

### ⭐ Task 1

Each item should have a **quantity**.

Example:

```
Milk

Price : 50

Quantity : 20
```

---

### ⭐⭐ Task 2

When `showItems()` is called,

display the quantity of every item.

---

### ⭐⭐⭐ Task 3

Add the following method:

```java
purchaseItem(String itemName, int quantity)
```

If sufficient stock is available,

reduce the quantity after purchase.

---

### ⭐⭐⭐ Task 4

If the customer requests more than the available stock,

display:

```
Only X items available.
```

---

### ⭐⭐⭐ Task 5

If an item's quantity becomes zero,

display:

```
Out Of Stock
```

---

### ⭐⭐⭐⭐ Task 6

Add the following method:

```java
restockItem(String itemName, int quantity)
```

Increase the quantity of the item.

---

### ⭐⭐⭐⭐ Task 7

Display all items whose quantity is less than **5**.

Example:

```
Items To Restock

Milk

Rice
```

---

## 💻 Final Solution

The updated implementation includes:

- Inventory (Quantity)
- Purchase Item
- Restocking
- Out Of Stock validation
- Low Stock Detection
- Clean OOP Design

---

## 📚 Concepts Practiced

- Object-Oriented Programming (OOP)
- Encapsulation
- Classes & Objects
- Constructors
- Collections (`ArrayList`)
- Business Logic
- Feature Enhancement
- Inventory Management

---

## 🎯 Purpose

This project was created for interview preparation to practice extending an existing Java application by implementing a real-world business feature.
