with open("D:\Java\stack\sahil_input.txt", "r") as input:
      
    # Creating "gfg output file.txt" as output
    # file in write mode
    with open("D:\Java\stack\sahil_output.txt", "w") as output:
          
        # Writing each line from input file to
        # output file using loop
        for line in input:
            output.write(line)