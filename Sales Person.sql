'''Query:- Find the names of all the salespersons who did not have any orders related to the company with the name "RED".'''

Solution:-

SELECT NAME
FROM SALESPERSON
WHERE SALES_ID NOT IN (SELECT SALES_ID FROM ORDERS WHERE COM_ID IN (SELECT COM_ID FROM COMPANY WHERE NAME = 'RED'))
