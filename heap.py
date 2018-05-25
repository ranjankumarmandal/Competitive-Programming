def swap(a, i, j):
  a[i], a[j] = a[j], a[i]

def sift_down(a, n, max):
  while True:
    biggest = n
    l = 2*n + 1
    r = l + 1
    for c in [l, r]:
      if c < max and a[c] > a[biggest]:
        biggest = c
    if biggest == n:
      return
    swap(a, n, biggest)
    n = biggest
    
def heapsort(a): 
  j = len(a) - 1
  while j>0 :
    swap(a, 0, j)
    sift_down(a, 0, j)
    j -= 1

a = [12, 11, 10, 9, -2,  8, 7, 1, 2, 3, 4, 5, 6, 0, -45]
heapsort(a)
print a
