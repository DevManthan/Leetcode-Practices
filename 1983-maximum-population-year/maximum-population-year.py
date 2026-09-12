class Solution(object):
    def maximumPopulation(self, logs):
        year = [0] * 101

        for birth, death in logs:
            year[birth - 1950] += 1
            year[death - 1950] -= 1

        max_year = 1950
        population = 0
        max_population = 0

        for i in range(0, 101):
            population += year[i]

            if population > max_population:
                max_population = population
                max_year = i + 1950

        return max_year