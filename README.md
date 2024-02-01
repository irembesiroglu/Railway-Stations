# Railway-Stations
You live in a city having N stations connected by M undirected railway tracks. Each track connects two distinct stations and no two tracks connect the same pair of stations. You can go from any station A to any station B, if there is a railway track between them. The distance between two stations is the minimum possible number of railway tracks on the path between them. You want to add new tracks in the city. But you do not want to decrease the distance between your home station X and TEDU station Y. You need to find the number of unordered pairs of two distinct stations that are not connected initially, such that if the new track between these two stations is built, the distance between stations X and Y won’t decrease.

In the input, the first line contains 4 space separated integers, N, M, X and Y. N denotes the total number of stations, M denotes the railway tracks, X denotes the home station and Y denotes TEDU station respectively. The next M lines represent the two integers A and B, such that there is a railway track from station A to station B.

In the sample input, it is given that we have 5 stations and 4 undirected railway tracks between them. And for this case, the home station is 3 and TEDU station is 5. The next lines give the connections between the stations.

Sample Input:

5 4 3 5

1 2

2 3

3 4

4 5

In the output, first line print an integer K, denoting the number of stations you add to the railway tracks. And the next K lines give the new railway tracks which do not decrease the distance between the stations X and Y denote the home station and TEDU station. If there is not any possible new tracks, your program should print -1.

The output for the above input is as follows. Please check your program with this input as well as the others that you will create. Please note that we may use other input when grading your assignments.

Sample Output:

5

1 3

1 4

1 5

2 5

2 4

