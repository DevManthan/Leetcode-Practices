class Solution(object):
    def maximumPopulation(self, logs):
        max_population = 0
        max_year = 1950

        for year in range(1950, 2051):
            population = 0

            for birth, death in logs:
                if birth <= year < death:
                    population += 1

            if population > max_population:
                max_population = population
                max_year = year

        return max_year