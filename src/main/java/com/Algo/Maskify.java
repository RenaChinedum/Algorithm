package com.Algo;

public class Maskify {
    public static String maskedDigit(String cc){
        if(cc.length() <= 4){
            return cc;
        }

        String masked = cc.substring(0,cc.length()-4);
        String unMasked = cc.substring(cc.length()-4);
        StringBuilder answer = new StringBuilder();
        for(char ch: masked.toCharArray()){
            answer.append("#");
        }
        return answer+unMasked;
    }

    public static void main(String[] args) {

        System.out.println( maskedDigit("465393749836873"));
        System.out.println(maskedDigit("765"));

    }

//    public String applyForJob(long jobID, Authentication auth) {
//        UserDetails loggedInEmployee = (UserDetails) auth.getPrincipal();
//        String email = loggedInEmployee.getUsername();
//        Integer numberOfApplicants =0;
//        Employee employee = employeeRepository.findByEmail(email).orElseThrow(()
//                -> new ResourceNotFoundException("User Not Found!"));
//        Role role = new Role();
//        if(!role.getName().equalsIgnoreCase("Staff")){
//            throw new UnauthorisedException("Sorry You must be a staff to apply");
//        }
//        Job job = jobRepository.findById(jobID).orElseThrow(()
//                -> new ResourceNotFoundException("Job Not Found!"));
//        numberOfApplicants = job.getTotalNumberOfApplicant();
//        if (!job.isActivationStatus()) {
//            return "Job Has Expired!";
//        }
//        job.getListOfApplicant().add(employee);
//        job.setTotalNumberOfApplicant(numberOfApplicants++);
//        jobRepository.save(job);
//        return "Application Successful";
//    }
//    ResponseEntity<String> applyForJob(@PathVariable long jobID, Authentication auth){
//        return new ResponseEntity<>(employeeService.applyForJob(jobID,auth),HttpStatus.OK);
//    }
}
