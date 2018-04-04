# EMI Calculator

#### Equated monthly installments

An equated monthly installment (EMI) is a fixed payment amount made by a borrower to a lender at a specified date each calendar month. Equated monthly installments are used to pay off both interest and principal each month so that over a specified number of years, the loan is paid off in full.

#### LoanAmount
Type: `number`  
Loan amount to be borrowed aka. principal value.
#### interestRate 
Type: `number`  
Interest rate expressed as an annual percentage of the amount lent.
#### LoanTerm 
Type: `number`  
TimePeriod for the loan repayment.

### Methods
#### .getEMI() 
Type: `function`  
Inputs: `LoanAmount , interestRate , LoanTerm `
Computing EMI for different combinations of principal loan amount, interest rates and loan term.
Returns: number
#### .getAmountPayable() 
Type: `function`  
Inputs: `LoanTerm , Emi`
The total amount payable during entire loan term.
Returns: number
#### .getinterestTowardsLoan() 
Type: `function`  
Inputs: `LoanAmount , Emi , LoanTerm `
returns amount interest towards the loan at the end of loan term.
Returns: number


#### USERS
* Admin
  - getInterestRate()
  - setInterestRate()
* Customer
  - getInterestRate()
