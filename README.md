# CSCI-652-Algorithmic-Bioinformatics


Substitution is a type of genomic mutation where one base is replaced by another type (e.g., A G, A T,
C T, etc.) There are two categories of substitutions: transition and transversion. Transition refers to
substitutions between A and G, and C and T. Transversion refers to all other types of substitutions. The ratio
between transition (ti) and transversion (tv) is a characteristics between a pair of species. Indel is another type
of genomic mutation, including insertion and deletion. An indel is represented as contiguous ‘-’ characters in
an alignment. Below is an example of short alignment between two species.
Species1 TTCTGATGACTAACTGGACTGA
Species2 TTCCG-----TAGCTGGACAGA
In above example, there are three substitutions: two transitions and one transversion. There is an indel of five
bases. When we analyze an alignment, substitutions are often referred to as “mismatches”. Positions in the
alignment with identical bases from each species are called “matches”. Similarly, an indel is often referred to
as a “gap”. A sequence of contiguous ‘-’ characters is counted as one gap. The gap length refers to the
number of ‘-’ characters in the gap.
For a given pairwise alignment between two species, we have following definitions:
Substitution rate = number-of- mismatches / (number-of-mismatches + number-of-matches)
ti/tv = number of transitions / number of transversions
gap rate = number of gaps / (number of matches + number of mismatches + number of gaps)
