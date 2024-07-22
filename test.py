import openpyxl

# Load the existing workbook
file_path = r"C:\Users\Michael\Downloads\calculation.xlsx"
workbook = openpyxl.load_workbook(file_path)
worksheet = workbook.active

# Read the input values from the specified cells
base_salary = float(worksheet['B3'].value)
# Convert percentage to decimal
target_award_pct = float(worksheet['B5'].value) / 100
# Convert percentage to decimal
business_result = float(worksheet['E3'].value) / 100
# Convert percentage to decimal
individual_result = float(worksheet['E4'].value) / 100
safety_result = float(worksheet['E5'].value) / \
    100  # Convert percentage to decimal

# Calculate the total award
total_award = base_salary * target_award_pct * \
    (business_result + individual_result + safety_result)

# Calculate the total award
total_award = base_salary * target_award_pct * \
    (business_result + individual_result + safety_result)

# Print the result to the terminal
print("Total Award (E10):", total_award)
