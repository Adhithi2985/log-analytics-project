# Log Analytics and Metrics Dashboard

This project is a complete, full-stack log analytics and metrics pipeline built from scratch. It uses a Spring Boot application to generate data, which is then collected, stored, and visualized using PostgreSQL, Prometheus, and Grafana. The entire system is containerized using Docker.



---



* **Log Generation:** A Spring Boot API that generates `INFO`, `WARN`, and `ERROR` logs.
* **Log Persistence:** All log entries are saved to a **PostgreSQL** database.
* **Metrics Collection:** All log events are counted as metrics and scraped by **Prometheus**.
* **All-in-One Dashboard:** A **Grafana** dashboard visualizes data from *both* PostgreSQL and Prometheus.





* **Application:** Java 17, Spring Boot 3
* **Database (Logs):** PostgreSQL
* **Metrics:** Prometheus
* **Dashboard:** Grafana
* **Containerization:** Docker & Docker Compose





This entire project is containerized, so all you need is Docker Desktop.

1.  **Start Docker Desktop.**
2.  Clone this repository.
3.  Open a terminal in the project's root folder and run:

    ```bash
    docker-compose up --build
    ```

4.  Wait for all four containers (`app`, `db`, `prometheus`, `grafana`) to start.





Once running, you can access all services from your browser:

* **Grafana (Your Dashboard):** `http://localhost:3000/`
    * **Login:** `admin` / `admin`

* **Prometheus (Metrics Server):** `http://localhost:9090/`
    * (You can check `Status` > `Targets` to see the app is connected.)

* **Your Spring Boot App (API):**
    * **Generate Info/Warn logs:** `http://localhost:8080/log`
    * **Generate 10 Error logs:** `http://localhost:8080/error`