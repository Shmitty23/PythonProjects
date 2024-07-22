import pandas as pd

# Load the Excel file
file_path = r"C:\Users\Michael\Downloads\calculation.xlsx"
xls = pd.ExcelFile(file_path)

# Load the sheets
sheet1 = pd.read_excel(xls, 'Sheet1')
table = pd.read_excel(xls, 'Table')

# Extract user input values from Sheet1
base_salary = sheet1.iloc[1, 1]
band = sheet1.iloc[2, 1]
target_award_pct = sheet1.iloc[3, 1]
business_result = sheet1.iloc[1, 4]
individual_result = sheet1.iloc[2, 4]
safety_result = sheet1.iloc[3, 4]

# Extract corresponding values from Table for the specified band
band_row = table[table.iloc[:, 0] == band]
target_award = band_row.iloc[0, 1]
business_weight = band_row.iloc[0, 2]
individual_weight = band_row.iloc[0, 3]
safety_weight = band_row.iloc[0, 4]

# Perform the calculation
total_award = base_salary * target_award * (
    business_weight * business_result +
    individual_weight * individual_result +
    safety_weight * safety_result
)

print(total_award)
