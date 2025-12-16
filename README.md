## ☁️ Cloud Troubleshooting Examples (AWS)
This repository contains practical notes and examples for diagnosing and resolving common cloud infrastructure issues, with a primary focus on AWS environments.
It reflects how a Support Engineer investigates incidents, escalations, and production issues.

## Common Cloud Issues Covered

- Application returning 502 / 503 errors

- High latency and timeout issues

- IAM permission failures

- Service unavailable incidents

- Misconfigured environment variables

- Resource limits and scaling problems


## 🛠️ AWS Services Referenced

- Amazon EC2

- AWS Lambda

- API Gateway

- CloudWatch Logs

- IAM


## 🧭 Troubleshooting Approach

When an incident occurs, I typically:

- Confirm scope and impact (single customer vs system-wide)

- Check monitoring dashboards and recent deployments

- Review logs in CloudWatch

- Validate configuration (IAM roles, environment variables)

- Reproduce the issue where possible

- Escalate with clear findings and evidence


## 📘 Example Scenario: API Gateway 502 Error

Symptoms

- Clients receive 502 Bad Gateway

- Intermittent failures during peak traffic

- Initial Checks

- Verify backend service health

- Review CloudWatch logs for errors

- Check API Gateway integration timeout settings

- Confirm IAM execution role permissions

Resolution

- Increased integration timeout

- Fixed misconfigured IAM role

- Redeployed API Gateway stage

## 📁 Planned Code Examples

- Java program to read and analyze log files

- Simple retry logic for transient failures

- Simulated service health check

- Example configuration validation


