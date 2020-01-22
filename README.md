## Payment

A Spring 5/Spring Boot microservice application intended to provide an API for processing payments of different types coming from different sources. 

### Supported Payment Types
* Cash or Check - Mobile Point of Sale
* Credit or Debit Card - PCI Compliant system to support one-time or recurring payments
* Automated Clearing House (ACH Debits - check by phone transactions
* Electronic Funds Transfer - Transfers initiated without generating the ACH check and processing directly through the processing bank. 
* Proxy Cash Payment - Uses a third party such as a bank or Western Union to collect the money and transmit it to the system user. 

The system must be capable of processing and reversing payments by each of the mechanisms noted in any currency used by the merchant, and must be secure enough to comply with PCI requirements

## Contributing

Please read the CONTRIBUTING.md
