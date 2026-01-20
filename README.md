# Hotel Reservation System

A robust Java-based domain model for managing hotel chains, rooms, and reservations. This project demonstrates high-quality software engineering principles, including **Encapsulation**, **Defensive Programming (WP7)**, and **Interdependence (WP8)**.

## 🏨 Project Overview

The Hotel Reservation System is designed to handle complex relationships between hotel chains, individual hotels, and their guests.

### Key Features

* **Domain-Driven Design:** Clear separation of concerns between models (Hotel, Room, Guest) and value objects (Money, Address).
* **Defensive Programming (WP7):** Strict validation in constructors to prevent invalid states (e.g., negative prices, invalid date ranges, or null associations).
* **Interdependence (WP8):** Complex associations linking Reservations to ReserverPayers and Rooms.
* **Comprehensive Testing:** 1:1 mapping of model classes to JUnit 5 test classes using the Arrange-Act-Assert (AAA) pattern.

---

