# avaj-launcher | 42KL

![UML](https://github.com/mseong123/avaj-launcher/blob/main/uml_diagram.png)
*UML class diagram of aircraft simulator

This project's objective delves into the domain of neuroscience where we have to parse, filter, preprocess EEG data and train a brain computer interface (BCI) program using the data. A BCI is a 
direct communication link between the brain's electrical activity and an external device, most commonly a computer or robotic limb. See [BCI Wikipedia]

### To preprocess data
```
python preprocessor.py --start <participant 1 - 109> --end <participant 1 - 109> --experiment <1 - 6> --visualize
```
This will run the script to perform frequency filtering (using Fast Fourier Transform from MNE library to convert data from time domain to frequency domain), perform Independent Component Analysis(ICA) to filter for further noise (ie eye blinks/movements) and run a program - AutoReject - which sample test and remove bad epochs. Results will converted back to time series domain and stored as .csv file in `./preprocessed_data` folder. 
