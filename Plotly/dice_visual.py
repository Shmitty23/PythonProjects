import plotly.express as px

from die import Die

# Create a two D6
die_1 = Die()
die_2 = Die()

# Make rolls and store the results in a list
results = []

for roll_num in range(1000):
    result = die_1.roll() + die_2.roll()
    results.append(result)

# Analyze results
frequenices = []
max_results = die_1.num_sides + die_2.num_sides
poss_results = range(2, max_results+1)
for value in poss_results:
    frequency = results.count(value)
    frequenices.append(frequency)


# Visualize results
title = "Results of Rolling Two D6 1,000 Times"
labels = {'x': 'Result', 'y': 'Frequency of Result'}
fig = px.bar(x=poss_results, y=frequenices, title=title, labels=labels)

# Further customizations
fig.update_layout(xaxis_dtick=1)

fig.show()
