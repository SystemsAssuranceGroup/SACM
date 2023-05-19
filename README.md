# SACM
This repository contains materials related to the Structured Assurance Case Metamodel (SACM).  
SACM is a standard released by the Object Management Group (OMG) for constructing model based system assurance cases.  
More information can be found at [1].  

The current version of SACM is 2.2, this repository contians materials for SACM 2.3 (to be released in year 2022), where the RTF of SACM stores latests updates to the standard.

# Folders:

Folder /diagram contains the files for the diagrams.  
Folder /diagram/dsl contains the files for the technology-independent metamodel.  
Folder /diagram/profile contains the files for the SACM UML profile.  
/diagram/emof.xml is the EMOF file for SACM 2.3.  

# Projects:
The project org.eclipse.acme.sacm.* contains the EMF (Eclipse Modelling Framework) of SACM 2.3 - please note that the metamodel is actively maintained, subscription to this repo is recommeneded.  
In the case that the metamodel is updated, the old version of EMF SACM models needs to be migrated, we recommend using the Eclipse Wizard Language (EWL) [2] for this purpose.   The project profile.sacm.omg contains the SACM 2.3 UML profile created using Papyrus [3] that conforms to UML 2.5.0.  

The project scs.acwg.gsn contains the EMF implementation of the GSN (Goal Structuring Notation) metamodel.  
GSN is a safety case standard maintained by the Assurance Case Working Group (ACWG), please refer to [4] for more details.  

At last, all pull requests are more than welcome.

## Please feel free to contact the RFT members of SACM for any questions:

[Robert Martin](ramartin@mitre.org) from MITRE  
[Ran Wei](rw741@cam.ac.uk) from University of Cambridge  
[Richard Hawkins](richard.hawkins@york.ac.uk) from University of York  
[Scott Ankrum](ankrums@mitre.org) from MITRE  
[Zhe jiang](zj226@cam.ac.uk) from University of Cambridge  
[Ioannis Sorokos](ioannis.sorokos@iese.fraunhofer.de) from Fraunhofer IESE  
More to be added soon...

[1]. https://www.omg.org/spec/SACM/2.2/About-SACM/  
[2]. https://www.eclipse.org/epsilon/  
[3]. https://www.eclipse.org/papyrus/  
[4]. https://scsc.uk/gsn
