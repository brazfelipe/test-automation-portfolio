# test-automation-portfolio
## Felipe's Test Automation Portfolio

Full-Stack Test Automation Portfolio to show my knowledge on multiple levels and types of test automation.

### Focus Areas:
* Performance Testing
* API Testing
* End-to-End (E2E) Testing
* Mobile Testing
* CI/CD Pipeline Integration

### Built With:
Languages: Python, JavaScript

Frameworks/Tools: Selenium, JMeter, Postman, Appium, Cypress, Playwright
CI/CD 

Tools: GitHub Actions, Jenkins

Other Technologies: Docker, Kubernetes, AWS

## Performance Testing
Usando JMeter, Java e Mockoon

* Teste de carga básico para uma API mockada.
  * Simulação de 500 usuários simultâneos por 5 minutos.
    * Abra o executável do mockoon presente na pasta resources
    * Clique em Start Server
    * Copie o comando a seguir e execute via terminal na pasta onde o projeto foi clonado:
    ```
    jmeter -n -t test-automation-portfolio/performance-testing/jmeter-mockoon/load-testing/demo-api-load-testing.jmx -l test-automation-portfolio/performance-testing/jmeter-mockoon/load-testing/reports/load-testing-report.csv -e -o test-automation-portfolio/performance-testing/jmeter-mockoon/load-testing/reports/load-testing-report
    ```
* Relatório de teste de carga com análise do resultado.
  * Após a execução uma pasta com o relatório HTML será criada em:
  > \test-automation-portfolio\performance-testing\jmeter-mockoon\load-testing\reports
  * Nessa mesma pasta esta disponibilizado um documento com a análise do relatório.


## API Testing


## End-to-End (E2E) Testing


## Mobile Testing


## CI/CD Pipeline Integration

