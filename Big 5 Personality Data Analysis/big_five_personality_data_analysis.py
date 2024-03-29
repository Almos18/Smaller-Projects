# -*- coding: utf-8 -*-
"""Andras Szivolics -Big_Five_Personality_Data_Analysis (2).ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1s-p2titIzTq9qrLaCmfCGl1UX3UfnYK5

# Applying the Data Analysis Method to a Research Problem

# 1. Determine Research Objectives and Assess the Situation  <a class="anchor" id="Businessunderstanding"></a>

## 1.1. Big Five Personality Test Question-Trait  Correlation <a class="anchor" id="Title"></a>

## 1.2. Introduction <a class="anchor" id="Introduction"></a>
- The project is about the 2018 big 5 personality online test dataset.
https://www.kaggle.com/tunguz/big-five-personality-test
- The big five personality theory is the most trackable and consistant personality theory used in reasearch. The data set I will be using is one taken from a website called truity.
https://www.truity.com/test/big-five-personality-test

- Unfortunately I can only find out so much from the data I have been given as the test doesn't ask information such as jobs, hobbies, phobias, religion, ethnicity, physique, politics etc.

- Neither can it find the possible test scores of the people the test takers surround themselves with, which might have shown a correlation of similar or opposite scorers that are friends, family or in a relationship.

- It also is limited to people who care to take the test to begin with, which will likely scew the data in favour of people that are higher in traits of Openess due to a higher interest in more abstract topics. This is also shown in the average Openess score of all users that took the test being above 50% (Will be shown in the describe data section.)

- Even if all of these were accounted for there would be no way to confirm the validity of the information so we are left with largely anonymous data.

- On kaggle there has already been plenty of data analysis performed, such as compiling test results and showing the average scores per country.

## 1.3.Terminology and Key Words<a class="anchor" id="Terminology"></a>
- The Big Five personality model divides personality characteristics into 5 categories, Openess, Conscientiousness, Extraversion, Agreeableness and Neuroticism, also known as OCEAN.

- Openess measures creativity, openess to new experience, interest in the abstract and higher IQ scores.

- Conscientiousness measures worth ethic, industriousness, rule following, preperation, and orderliness.

- Extraversion measures an individual's time spent interacting with the external world as opposed to the internal.

- Agreeableness measures cooperation, trust, empathy and kindness.

- Neuroticism measures an individual's tendency to feel and be affected by negative emotion.

- Sources:

https://www.verywellmind.com/the-big-five-personality-dimensions-2795422

https://www.psychologytoday.com/us/basics/big-5-personality-traits

https://psychcentral.com/lib/the-big-five-personality-traits

## 1.2.Background <a class="anchor" id="Background"></a>
- Similar data analysis dataset done to find results per country:
https://www.kaggle.com/evgeniidorovskikh/big-5-personality-test-per-country-exploration

## 1.3 Research Questions <a class="anchor" id="Research Question"></a>

The primariy things I am trying to answer are:


- The test questions that impact the score of a specific trait but are least likely to be ticked as '5' (most accurate).

- The test questions that impact the score of a specific trait but are least likely to be ticked as '1' (least accurate).

- Are there any personality types that can be seen when gathered the results of a few thousand participants.

- What is the most commonly highly scored trait and the lowest?

-What are the results of each trait per person taking the test?

# 2. Stage  Two - Data Understanding <a class="anchor" id="Dataunderstanding"></a>
"""

# Commented out IPython magic to ensure Python compatibility.
# Import Libraries Required
import pandas as pd
import matplotlib.pyplot as plt
# %matplotlib inline
import numpy as np
import seaborn as sns
from google.colab import drive
drive.mount("/content/gdrive")

#Data source:
#Source Query location:
path = '/content/gdrive/My Drive/data-final.csv'
# reads the data from the file - denotes as CSV, it has no header, sets column headers
df = pd.read_csv(path, sep='\t+')

df
#There are 50 questions in total with EXT marking extraversion, EST marking neuroticism,
#AGR marking agreeblenessm CNS marking conscientiousness and OPN marking openness.

"""## 2.2 Describe Data <a class="anchor" id="Describedata"></a>

"""

df.columns

df.shape

df.dtypes

df.info()

"""## 2.3 Verify Data Quality <a class="anchor" id="Verifydataquality"></a>

### 2.3.1. Missing Data <a class="anchor" id="MissingData"></a>


- Here is where I will find the top three question most frequently answered as '3'.
"""

neutral = df[df.columns[0:50]]
neutral[neutral==3].dropna().size
# The amount of neutral statements selected by everyone that took the test in the first 50 questions is 34150

four = df[df.columns[0:50]]
four[four==4].dropna().size

five = df[df.columns[0:50]]
five[five==5].dropna().size

two = df[df.columns[0:50]]
two[two==2].dropna().size

one = df[df.columns[0:50]]
one[one==1].dropna().size

"""# 4. Modelling <a class="anchor" id="Modelling"></a>


"""

highest_ext = 0
lowest_ext = 10000000
test = 0
highest_overall = 0
lowest_overall = 10000000

for x in range(1,11):
  print('EXT' + str(x), 'has:', int(df[df['EXT' + str(x)]==5.0].loc[:,'EXT' + str(x)].value_counts()), '\n')
  test = df[df['EXT' + str(x)]==5.0].loc[:,'EXT' + str(x)].value_counts()

  if float(test) > float(highest_ext):
    highest_ext = test

  if float(test) < float(lowest_ext):
    lowest_ext = test

if float(highest_ext) > float(highest_overall):
  highest_overall = highest_ext

if float(lowest_ext) < float(lowest_overall):
  lowest_overall = lowest_ext


print('\nThe most frequently selected 5.0 question in EXT is:',highest_ext)
print('\nThe most frequently selected 5.0 question overall is:',highest_overall)

print('\nThe least frequently selected 5.0 question in EXT is:',lowest_ext)
print('\nThe least frequently selected 5.0 question overall is:',lowest_overall)
# This loop goes through the 10 questions that measure extraversion and counts the amount people answered 5.0 to.

# From the ten questions that measure extraversion, EXT6 was the one least likely (at 71662 people selected) to be answered as '5'
# EXT10 was the one most frequent to be selected as 5.0 (at 312925).

lowest_est = 10000000
highest_est = 0
test = 0

for x in range(1,11):
  print('EST' + str(x), 'has:', int(df[df['EST' + str(x)]==5.0].loc[:,'EST' + str(x)].value_counts()), '\n')
  test = df[df['EST' + str(x)]==5.0].loc[:,'EST' + str(x)].value_counts()

  if float(test) > float(highest_est):
    highest_est = test

  if float(test) < float(lowest_est):
    lowest_est = test

if float(highest_est) > float(highest_overall):
  highest_overall = highest_est

if float(lowest_est) < float(lowest_overall):
  lowest_overall = lowest_est

print('\nThe most frequently selected question in EST is:',highest_est)
print('\nThe most frequently selected question overall is:',highest_overall)

print('\nThe least frequently selected 5.0 question in EST is:',lowest_est)
print('\nThe least frequently selected 5.0 question overall is:',lowest_overall)

# This loop goes through the 10 questions that measure neuroticism and counts the amount people answered 5.0 to.

# From the ten questions that measure neuroticism, EST4 was the one least likely (at 95145 people selected) to
# be answered as 5.0. EST3 was the one most frequent to be selected as 5.0 (at 352309 people selected).

lowest_agr = 10000000
highest_agr = 0
test = 0

for x in range(1,11):
  print('AGR' + str(x), 'has:', int(df[df['AGR' + str(x)]==5.0].loc[:,'AGR' + str(x)].value_counts()), '\n')
  test = df[df['AGR' + str(x)]==5.0].loc[:,'AGR' + str(x)].value_counts()

  if float(test) > float(highest_agr):
    highest_agr = test

  if float(test) < float(lowest_agr):
    lowest_agr = test

if float(highest_agr) > float(highest_overall):
  highest_overall = highest_agr

if float(lowest_agr) < float(lowest_overall):
  lowest_overall = lowest_agr


print('\nThe most frequently selected question in AGR is:',highest_agr)
print('\nThe most frequently selected question overall is:',highest_overall)

print('\nThe least frequently selected 5.0 question in AGR is:',lowest_agr)
print('\nThe least frequently selected 5.0 question overall is:',lowest_overall)

# This loop goes through the 10 questions that measure agreeableness and counts the amount people answered 5.0 to.

# From the ten questions that measure agreeableness, AGR7 was the one least likely (at 40458 people selected) to
# be answered as 5.0. AGR4 was the one most frequent to be selected as 5.0 (at 374645 people selected).

lowest_csn = 1000000
highest_csn = 0
test = 0

for x in range(1,11):
  print('CSN' + str(x), 'has:', df[df['CSN' + str(x)]==5.0].loc[:,'CSN' + str(x)].value_counts(), '\n')
  test = df[df['CSN' + str(x)]==5.0].loc[:,'CSN' + str(x)].value_counts()

  if float(test) > float(highest_csn):
    highest_csn = test

  if float(test) < float(lowest_csn):
    lowest_csn = test

if float(highest_csn) > float(highest_overall):
  highest_overall = highest_csn

if float(lowest_csn) < float(lowest_overall):
  lowest_overall = lowest_csn


print('\nThe most frequently selected question in CSN is:',highest_csn)
print('\nThe most frequently selected question overall is:',highest_overall)

print('\nThe least frequently selected 5.0 question in CSN is:',lowest_csn)
print('\nThe least frequently selected 5.0 question overall is:',lowest_overall)

# This loop goes through the 10 questions that measure consciousness and counts the amount people answered 5.0 to.

# From the ten questions that measure consciousness, CSN8 was the one least likely (at 47113 people selected) to
# be answered as 5.0. CSN3 was the one most frequent to be selected as 5.0 (at 370372 people selected).

lowest_opn = 1000000
highest_opn = 0
test = 0

for x in range(1,11):
  print('OPN' + str(x), 'has:', df[df['OPN' + str(x)]==5.0].loc[:,'OPN' + str(x)].value_counts(), '\n')
  test = df[df['OPN' + str(x)]==5.0].loc[:,'OPN' + str(x)].value_counts()

  if float(test) > float(highest_opn):
    highest_opn = test

  if float(test) < float(lowest_opn):
    lowest_opn = test

if float(highest_opn) > float(highest_overall):
  highest_overall = highest_opn

if float(lowest_opn) < float(lowest_overall):
  lowest_overall = lowest_opn


print('\nThe most frequently selected question in OPN is:',highest_opn)
print('\nThe most frequently selected question overall is:',highest_overall)

print('\nThe least frequently selected 5.0 question in OPN is:',lowest_opn)
print('\nThe least frequently selected 5.0 question overall is:',lowest_overall)

# This loop goes through the 10 questions that measure openness and counts the amount people answered 5.0 to.

# From the ten questions that measure openness, OPN2 was the one least likely (at 35057 people selected) to
# be answered as 5.0. OPN9 was the one most frequent to be selected as 5.0 (at 456735 people selected).

fraction_df = len(df) // 200
df_fraction = df.iloc[:fraction_df,]
print(df_fraction)
#Here I'm making another dataset which is just the current dataset but reduced
#to 5076 entries

total_extraversion = []
extraversion_score = 0

for x in range(0,5076):
  for y in range(1,11):
    if (y % 2) != 0:
      extraversion_score += df_fraction['EXT' + str(y)].iloc[x]
    else:
      if df_fraction['EXT' + str(y)].iloc[x] == 1:
        extraversion_score += 5

      elif df_fraction['EXT' + str(y)].iloc[x] == 2:
        extraversion_score += 4

      elif df_fraction['EXT' + str(y)].iloc[x] == 4:
        extraversion_score += 2

      elif df_fraction['EXT' + str(y)].iloc[x] == 5:
        extraversion_score += 1

      else:
        extraversion_score += 3

  total_extraversion.append(int(extraversion_score))
  extraversion_score = 0

total_neuroticism = []
neuroticism_score = 0

#Here in the if statement I have to include exceptions as the answeres don't
#cycle through a positive coralation then a negative coralation

for x in range(0,5076):
  for y in range(1,11):
    if (y % 2 ) != 0 or (('EST' + str(y)) == 'EST6' or ('EST' + str(y)) == 'EST8' or ('EST' + str(y)) == 'EST10'):
      neuroticism_score += df_fraction['EST' + str(y)].iloc[x]
    else:
      if df_fraction['EST' + str(y)].iloc[x] == 1:
        neuroticism_score += 5

      elif df_fraction['EST' + str(y)].iloc[x] == 2:
        neuroticism_score += 4

      elif df_fraction['EST' + str(y)].iloc[x] == 4:
        neuroticism_score += 2

      elif df_fraction['EST' + str(y)].iloc[x] == 5:
        neuroticism_score += 1

      else:
        neuroticism_score += 3

  total_neuroticism.append(int(neuroticism_score))
  neuroticism_score = 0

total_agreeableness = []
agreeableness_score = 0

for x in range(0,5076):
  for y in range(1,11):
    if (y % 2 ) == 0 or ('AGR' + str(y)) == 'AGR9':
      agreeableness_score += df_fraction['AGR' + str(y)].iloc[x]
    else:
      if df_fraction['AGR' + str(y)].iloc[x] == 1:
        agreeableness_score += 5

      elif df_fraction['AGR' + str(y)].iloc[x] == 2:
        agreeableness_score += 4

      elif df_fraction['AGR' + str(y)].iloc[x] == 4:
        agreeableness_score += 2

      elif df_fraction['AGR' + str(y)].iloc[x] == 5:
        agreeableness_score += 1

      else:
        agreeableness_score += 3

  total_agreeableness.append(int(agreeableness_score))
  agreeableness_score = 0

total_conscientiousness = []
conscientiousness_score = 0

for x in range(0,5076):
  for y in range(1,11):
    if (y % 2 ) != 0 or ('CSN' + str(y)) == 'CSN10':
      conscientiousness_score  += df_fraction['CSN' + str(y)].iloc[x]
    else:
      if df_fraction['CSN' + str(y)].iloc[x] == 1:
        conscientiousness_score  += 5

      elif df_fraction['CSN' + str(y)].iloc[x] == 2:
        conscientiousness_score  += 4

      elif df_fraction['CSN' + str(y)].iloc[x] == 4:
        conscientiousness_score  += 2

      elif df_fraction['CSN' + str(y)].iloc[x] == 5:
        conscientiousness_score  += 1

      else:
        conscientiousness_score  += 3

  total_conscientiousness.append(int(conscientiousness_score ))
  conscientiousness_score  = 0

total_oppeness = []
openess_score = 0

for x in range(0,5076):
  for y in range(1,11):
    if (y % 2 ) != 0 or (('OPN' + str(y)) == 'OPN8' or ('OPN' + str(y)) == 'OPN10'):
      openess_score += df_fraction['OPN' + str(y)].iloc[x]
    else:
      if df_fraction['OPN' + str(y)].iloc[x] == 1:
        openess_score += 5

      elif df_fraction['OPN' + str(y)].iloc[x] == 2:
        openess_score += 4

      elif df_fraction['OPN' + str(y)].iloc[x] == 4:
        openess_score += 2

      elif df_fraction['OPN' + str(y)].iloc[x] == 5:
        openess_score += 1

      else:
        openess_score += 3

  total_oppeness.append(int(openess_score))
  openess_score = 0

df_fraction.insert(loc=0, column='Extraversion Scores (Min=20, Max=50)', value=total_extraversion, allow_duplicates=True)
df_fraction.insert(loc=0, column='Neuroticism Scores (Min=20, Max=50)', value=total_neuroticism, allow_duplicates=True)
df_fraction.insert(loc=0, column='Agreeableness Scores (Min=20, Max=50)', value=total_agreeableness, allow_duplicates=True)
df_fraction.insert(loc=0, column='Conscientiousness Scores (Min=20, Max=50)', value=total_conscientiousness, allow_duplicates=True)
df_fraction.insert(loc=0, column='Oppeness Scores (Min=20, Max=50)', value=total_oppeness, allow_duplicates=True)
df_fraction
#I have confirmed the loops have iterated through correctly even with the exceptions such as OPN8 or OPN10 as I manually
#calculated by selecting a random row and adding up what the scores should be and cross checking it with the results produced
#and they all added up.

"""https://pythonspot.com/matplotlib-scatterplot/"""

import numpy as np
import matplotlib.pyplot as plt


x = total_extraversion
y = total_neuroticism
colors = (0,1,0)
area = np.pi*3

plt.scatter(x, y, s=area, c=colors, alpha=0.1)
plt.title('Scatter plot of the scores between extraversion and neuroticism')
plt.xlabel('x')
plt.ylabel('y')
plt.show()

df_fraction['Extraversion Scores (Min=20, Max=50)'].describe()

df_fraction['Neuroticism Scores (Min=20, Max=50)'].describe()

df_fraction['Agreeableness Scores (Min=20, Max=50)'].describe()

df_fraction['Conscientiousness Scores (Min=20, Max=50)'].describe()

df_fraction['Oppeness Scores (Min=20, Max=50)'].describe()

"""## 6. Results/Data/Findings <a class="anchor" id="Results"></a>
- The answer most frequently occuring as 5.0 from the first 50 questions is OPN9 at 456735 and the least likely to be answered as 5.0 is OPN4 at 33235.
- The question of OPN9 is 'I spend time reflecting on things' and the question for OPN4 is 'I am not interested in abstract ideas'.
- A high score in OPN9 and a low score in OPN4 both increase the score of Openness due to OPN4 being reversed.
- The highest mean score in all of the types is openness at 38.
- The lowest mean score in all of the types is extraversion at 29.
- The question most frequently answered as 5 is OPN4 "I spend time reflecting on things."
- The question least frequently answered as 5 is OPN9 "I am not interested in abstract ideas."

# 6. Discussion <a class="anchor" id="Discussion"></a>

Discussion
- It's often said that people in general tend to be above average in agreeableness and this is reflected within the results.
- The highest average score being oppeness could be a result of the fact that the people that tend to take online tests such as this one willingly are much more likely to have higher oppeness due to the curiosity and creativity factor. This can also be seen with the question most and least frequently answered 5 are two oppeness questions both of which boost oppeness scores.
- The lowest average score being extraversion could be the result of more introverted types valuing their free time to themselves, resulting in a lot more time spent online and eventually coming across this test.
- The high oppeness score could also be a result of the questions generally asking desirable traits to have which people naturally don't want to rank themselves low on. For other traits this doesn't apply too much with questions like "I make friends easily" being pretty easy to see.
-It could be that the first 5076 people to take the test are not representative of the over 1 million much less the entire population however I still think the results are as I imagined with highly open and introverted people taking the test.

# 7. Conclusion <a class="anchor" id="Conclusion"></a>
- The highest trait of people willing to take tests online is most likely oppeness and the lowest is extraversion.
- People that took the test like to label themselves as reflecting on things and generally have a bigger interest in abstract ideas compared to any other question.

# 8. Reference List/Bibliography <a class="anchor" id="Reference"></a>

- List full details for any works you have referred to in the report.
- For the correct style of referencing to use, check college guidelines.  
- If you are uncertain about how or when to reference, see the college library referencing guide.
"""