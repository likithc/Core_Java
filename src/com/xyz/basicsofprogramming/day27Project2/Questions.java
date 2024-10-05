package com.xyz.basicsofprogramming.day27Project2;
import java.util.Scanner;

public class Questions {
	static int life_line_count=2;
	static int aud_phn_cnt=1;
	static int fifty_fifty_cnt=1;
	Scanner sc = new Scanner(System.in);
	int amount;
	int totalReward=0;
 		
	public boolean question1(String name) {
		System.out.println("1. Who is the founder of Java?");
		System.out.println("a. Dennis Ritchie\n"
						 + "b. Stroustrup\n"
						 + "c. Charles Babbage\n"
						 + "d. James Gosling\n"
						 + "e. Life Line");
		String res = sc.next();
		int sel1=0;
		String sel2;
		if(res.equalsIgnoreCase("e")) {
			if(life_line_count!=0) {
				System.out.println("You have the following Life Lines: \n"
								 + "1. Audiance Phone\n"
								 + "2. 50-50\n");
				sel1=sc.nextInt();
				if(sel1==1) {
					if(aud_phn_cnt!=0) {
						aud_phn_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "b. Stroustrup ---> 5%\n"
								 + "c. Charles Babbage ---> 15%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs.10000\n");
							amount = 10000;
							totalReward += amount;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "2. 50-50\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(fifty_fifty_cnt!=0) {
								fifty_fifty_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs.10000\n");
									amount = 10000;
									totalReward += amount;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs.10000\n");
									amount = 10000;
									totalReward += amount;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs.10000\n");
								amount = 10000;
								totalReward += amount;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
				else if(sel1==2) {
					if(fifty_fifty_cnt!=0) {
						fifty_fifty_cnt--;
						life_line_count--;
						System.out.println("Select your choice: ");
						System.out.println("a. Dennis Ritchie ---> 20%\n"
								 + "d. James Gosling ---> 60%\n");
						res = sc.next();
						if(res.equalsIgnoreCase("d")) {
							System.out.println("Correct Answer You have won Rs.10000\n");
							amount = 10000;
							totalReward += amount;
							return true;
						}
						else {
							System.out.println("Wrong Answer. You have completed the game.");
							System.out.println("Your take away reward is : "+amount);
							return false;
						}
					}
					else {
						System.out.println("You have already used this life line.\n"
										 + "Available Life line is : \n"
										 + "1. audiance phone\n"
										 + "Do you wish to use it?(y/n)");
						sel2 = sc.next();
						if(sel2.equalsIgnoreCase("y")) {
							if(aud_phn_cnt!=0) {
								aud_phn_cnt--;
								life_line_count--;
								System.out.println("Select your choice: ");
								System.out.println("a. Dennis Ritchie ---> 20%\n"
										 + "b. Stroustrup ---> 5%\n"
										 + "c. Charles Babbage ---> 15%\n"
										 + "d. James Gosling ---> 60%\n");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs.10000\n");
									amount = 10000;
									totalReward += amount;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
							else {
								System.out.println("None of the life lines are available.");
								System.out.println("Choose the correct option: ");
								System.out.println("a. Dennis Ritchie\n"
										 + "b. Stroustrup\n"
										 + "c. Charles Babbage\n"
										 + "d. James Gosling\n"
										 + "e. Life Line");
								res = sc.next();
								if(res.equalsIgnoreCase("d")) {
									System.out.println("Correct Answer You have won Rs.10000\n");
									amount = 10000;
									totalReward += amount;
									return true;
								}
								else {
									System.out.println("Wrong Answer. You have completed the game.");
									System.out.println("Your take away reward is : "+amount);
									return false;
								}
							}
						}
						else {
							System.out.println("Choose the correct option: ");
							System.out.println("a. Dennis Ritchie\n"
									 + "b. Stroustrup\n"
									 + "c. Charles Babbage\n"
									 + "d. James Gosling\n"
									 + "e. Life Line");
							res = sc.next();
							if(res.equalsIgnoreCase("d")) {
								System.out.println("Correct Answer You have won Rs.10000\n");
								amount = 10000;
								totalReward += amount;
								return true;
							}
							else {
								System.out.println("Wrong Answer. You have completed the game.");
								System.out.println("Your take away reward is : "+amount);
								return false;
							}
						}
					}
				}
			}
		}
		else {
			if(res.equalsIgnoreCase("d")) {
				System.out.println("Correct Answer You have won Rs.10000\n");
				amount = 10000;
				totalReward += amount;
				return true;
			}
			else {
				System.out.println("Wrong Answer. You have completed the game.");
				System.out.println("Your take away reward is : "+amount);
				return false;
			}
		}
		return false;
	}
	
	//-------------------------------------------------------------------------------
	public boolean question2(String name) {
	    System.out.println("2. What is the capital of France?");
	    System.out.println("a. Madrid\n"
	                     + "b. Berlin\n"
	                     + "c. Paris\n"
	                     + "d. Rome\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Madrid ---> 5%\n"
	                                     + "b. Berlin ---> 10%\n"
	                                     + "c. Paris ---> 70%\n"
	                                     + "d. Rome ---> 15%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.50000\n");
	                        amount = 50000;
	                        totalReward += amount;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("c. Paris ---> 70%\n"
	                                             + "d. Rome ---> 15%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.50000\n");
	                                amount = 50000;
	                                totalReward += amount;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Madrid\n"
	                                             + "b. Berlin\n"
	                                             + "c. Paris\n"
	                                             + "d. Rome\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.50000\n");
	                                amount = 50000;
	                                totalReward += amount;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Madrid\n"
	                                         + "b. Berlin\n"
	                                         + "c. Paris\n"
	                                         + "d. Rome\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.50000\n");
	                            amount = 50000;
	                            totalReward += amount;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("c. Paris ---> 70%\n"
	                                     + "d. Rome ---> 15%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.50000\n");
	                        amount = 50000;
	                        totalReward += amount;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Madrid ---> 5%\n"
	                                             + "b. Berlin ---> 10%\n"
	                                             + "c. Paris ---> 70%\n"
	                                             + "d. Rome ---> 15%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.50000\n");
	                                amount = 50000;
	                                totalReward += amount;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Madrid\n"
	                                             + "b. Berlin\n"
	                                             + "c. Paris\n"
	                                             + "d. Rome\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.50000\n");
	                                amount = 50000;
	                                totalReward += amount;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Madrid\n"
	                                         + "b. Berlin\n"
	                                         + "c. Paris\n"
	                                         + "d. Rome\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.50000\n");
	                            amount = 50000;
	                            totalReward += amount;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("c")) {
	            System.out.println("Correct Answer! You have won Rs.50000\n");
	            amount = 50000;
	            totalReward += amount;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}

	//-----------------------------------------------------------------------------------
	
	public boolean question3(String name) {
	    System.out.println("3. What is the square root of 64?");
	    System.out.println("a. 6\n"
	                     + "b. 8\n"
	                     + "c. 10\n"
	                     + "d. 12\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. 6 ---> 10%\n"
	                                     + "b. 8 ---> 80%\n"
	                                     + "c. 10 ---> 5%\n"
	                                     + "d. 12 ---> 5%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.100000\n");
	                        amount = 100000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("b. 8 ---> 80%\n"
	                                             + "d. 12 ---> 5%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.100000\n");
	                                amount = 100000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. 6\n"
	                                             + "b. 8\n"
	                                             + "c. 10\n"
	                                             + "d. 12\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.10000\n");
	                                amount = 100000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. 6\n"
	                                         + "b. 8\n"
	                                         + "c. 10\n"
	                                         + "d. 12\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.100000\n");
	                            amount = 100000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("b. 8 ---> 80%\n"
	                                     + "d. 12 ---> 5%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.100000\n");
	                        amount = 100000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. 6 ---> 10%\n"
	                                             + "b. 8 ---> 80%\n"
	                                             + "c. 10 ---> 5%\n"
	                                             + "d. 12 ---> 5%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.100000\n");
	                                amount = 100000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. 6\n"
	                                             + "b. 8\n"
	                                             + "c. 10\n"
	                                             + "d. 12\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.100000\n");
	                                amount = 100000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. 6\n"
	                                         + "b. 8\n"
	                                         + "c. 10\n"
	                                         + "d. 12\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.100000");
	                            amount = 100000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("b")) {
	            System.out.println("Correct Answer! You have won Rs.100000\n");
	            amount = 100000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}

	//-------------------------------------------------------------------------------------------------
	
	public boolean question4(String name) {
	    System.out.println("4. What is the capital of Australia?");
	    System.out.println("a. Sydney\n"
	                     + "b. Melbourne\n"
	                     + "c. Canberra\n"
	                     + "d. Perth\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Sydney ---> 30%\n"
	                                     + "b. Melbourne ---> 20%\n"
	                                     + "c. Canberra ---> 40%\n"
	                                     + "d. Perth ---> 10%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.500000\n");
	                        amount = 500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Sydney ---> 30%\n"
	                                             + "c. Canberra ---> 40%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.500000\n");
	                                amount = 500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Sydney\n"
	                                             + "b. Melbourne\n"
	                                             + "c. Canberra\n"
	                                             + "d. Perth\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.500000\n");
	                                amount = 500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Sydney\n"
	                                         + "b. Melbourne\n"
	                                         + "c. Canberra\n"
	                                         + "d. Perth\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.500000\n");
	                            amount = 500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Sydney ---> 30%\n"
	                                     + "c. Canberra ---> 40%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.500000\n");
	                        amount = 500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Sydney ---> 30%\n"
	                                             + "b. Melbourne ---> 20%\n"
	                                             + "c. Canberra ---> 40%\n"
	                                             + "d. Perth ---> 10%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.500000\n");
	                                amount = 500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Sydney\n"
	                                             + "b. Melbourne\n"
	                                             + "c. Canberra\n"
	                                             + "d. Perth\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.500000\n");
	                                amount = 500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Sydney\n"
	                                         + "b. Melbourne\n"
	                                         + "c. Canberra\n"
	                                         + "d. Perth\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.500000\n");
	                            amount = 500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("c")) {
	            System.out.println("Correct Answer! You have won Rs.500000\n");
	            amount = 500000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}
//-----------------------------------------------------------------------------------------
	
	public boolean question5(String name) {
	    System.out.println("5. Which planet is known as the Red Planet?");
	    System.out.println("a. Earth\n"
	                     + "b. Venus\n"
	                     + "c. Mars\n"
	                     + "d. Jupiter\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Earth ---> 10%\n"
	                                     + "b. Venus ---> 20%\n"
	                                     + "c. Mars ---> 60%\n"
	                                     + "d. Jupiter ---> 10%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.1000000\n");
	                        amount = 1000000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("c. Mars ---> 60%\n"
	                                             + "b. Venus ---> 20%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.1000000\n");
	                                amount = 1000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Earth\n"
	                                             + "b. Venus\n"
	                                             + "c. Mars\n"
	                                             + "d. Jupiter\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.1000000\n");
	                                amount = 1000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Earth\n"
	                                         + "b. Venus\n"
	                                         + "c. Mars\n"
	                                         + "d. Jupiter\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.1000000");
	                            amount = 1000000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("c. Mars ---> 60%\n"
	                                     + "d. Jupiter ---> 10%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.1000000\n");
	                        amount = 1000000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Earth ---> 10%\n"
	                                             + "b. Venus ---> 20%\n"
	                                             + "c. Mars ---> 60%\n"
	                                             + "d. Jupiter ---> 10%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.1000000\n");
	                                amount = 1000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Earth\n"
	                                             + "b. Venus\n"
	                                             + "c. Mars\n"
	                                             + "d. Jupiter\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.1000000\n");
	                                amount = 1000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Earth\n"
	                                         + "b. Venus\n"
	                                         + "c. Mars\n"
	                                         + "d. Jupiter\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.1000000\n");
	                            amount = 1000000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("c")) {
	            System.out.println("Correct Answer! You have won Rs.1000000\n");
	            amount = 1000000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}
//-------------------------------------------------------------------------------------------------
	public boolean question6(String name) {
	    System.out.println("6. Who painted the Mona Lisa?");
	    System.out.println("a. Pablo Picasso\n"
	                     + "b. Leonardo da Vinci\n"
	                     + "c. Vincent van Gogh\n"
	                     + "d. Claude Monet\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Pablo Picasso ---> 10%\n"
	                                     + "b. Leonardo da Vinci ---> 70%\n"
	                                     + "c. Vincent van Gogh ---> 15%\n"
	                                     + "d. Claude Monet ---> 5%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.1500000\n");
	                        amount = 1500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("b. Leonardo da Vinci ---> 70%\n"
	                                             + "c. Vincent van Gogh ---> 15%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.1500000\n");
	                                amount = 1500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Pablo Picasso\n"
	                                             + "b. Leonardo da Vinci\n"
	                                             + "c. Vincent van Gogh\n"
	                                             + "d. Claude Monet\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.1500000\n");
	                                amount = 1500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Pablo Picasso\n"
	                                         + "b. Leonardo da Vinci\n"
	                                         + "c. Vincent van Gogh\n"
	                                         + "d. Claude Monet\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.1500000\n");
	                            amount = 1500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("b. Leonardo da Vinci ---> 70%\n"
	                                     + "d. Claude Monet ---> 5%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.1500000\n");
	                        amount = 1500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Pablo Picasso ---> 10%\n"
	                                             + "b. Leonardo da Vinci ---> 70%\n"
	                                             + "c. Vincent van Gogh ---> 15%\n"
	                                             + "d. Claude Monet ---> 5%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.1500000\n");
	                                amount = 1500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Pablo Picasso\n"
	                                             + "b. Leonardo da Vinci\n"
	                                             + "c. Vincent van Gogh\n"
	                                             + "d. Claude Monet\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.1500000\n");
	                                amount = 1500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Pablo Picasso\n"
	                                         + "b. Leonardo da Vinci\n"
	                                         + "c. Vincent van Gogh\n"
	                                         + "d. Claude Monet\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.1500000\n");
	                            amount = 1500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("b")) {
	            System.out.println("Correct Answer! You have won Rs.1500000\n");
	            amount = 1500000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}
//---------------------------------------------------------------------------------------------------
	
	
	public boolean question7(String name) {
	    System.out.println("7. Which of the following is not a Java feature?");
	    System.out.println("a. Object-Oriented\n"
	                     + "b. Use of Pointers\n"
	                     + "c. Platform Independent\n"
	                     + "d. Dynamic and Extensible\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Object-Oriented ---> 10%\n"
	                                     + "b. Use of Pointers ---> 75%\n"
	                                     + "c. Platform Independent ---> 10%\n"
	                                     + "d. Dynamic and Extensible ---> 5%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.2500000\n");
	                        amount = 2500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("b. Use of Pointers\n"
	                                             + "c. Platform Independent\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.2500000\n");
	                                amount = 2500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Object-Oriented\n"
	                                             + "b. Use of Pointers\n"
	                                             + "c. Platform Independent\n"
	                                             + "d. Dynamic and Extensible\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.2500000\n");
	                                amount = 2500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Object-Oriented\n"
	                                         + "b. Use of Pointers\n"
	                                         + "c. Platform Independent\n"
	                                         + "d. Dynamic and Extensible\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.2500000\n");
	                            amount = 2500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("b. Use of Pointers\n"
	                                     + "c. Platform Independent\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.2500000\n");
	                        amount = 2500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Object-Oriented ---> 10%\n"
	                                             + "b. Use of Pointers ---> 75%\n"
	                                             + "c. Platform Independent ---> 10%\n"
	                                             + "d. Dynamic and Extensible ---> 5%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.2500000\n");
	                                amount = 2500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Object-Oriented\n"
	                                             + "b. Use of Pointers\n"
	                                             + "c. Platform Independent\n"
	                                             + "d. Dynamic and Extensible\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.2500000\n");
	                                amount = 2500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Object-Oriented\n"
	                                         + "b. Use of Pointers\n"
	                                         + "c. Platform Independent\n"
	                                         + "d. Dynamic and Extensible\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.2500000\n");
	                            amount = 2500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("b")) {
	            System.out.println("Correct Answer! You have won Rs.2500000\n");
	            amount = 2500000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}

//----------------------------------------------------------------------------------------------------------
	
	public boolean question8(String name) {
	    System.out.println("8. What is the chemical symbol for Gold?");
	    System.out.println("a. Au\n"
	                     + "b. Ag\n"
	                     + "c. Pb\n"
	                     + "d. Fe\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Au ---> 75%\n"
	                                     + "b. Ag ---> 15%\n"
	                                     + "c. Pb ---> 5%\n"
	                                     + "d. Fe ---> 5%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("a")) {
	                        System.out.println("Correct Answer! You have won Rs.5000000\n");
	                        amount = 5000000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Au\n"
	                                             + "b. Ag\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("a")) {
	                                System.out.println("Correct Answer! You have won Rs.5000000\n");
	                                amount = 5000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Au\n"
	                                             + "b. Ag\n"
	                                             + "c. Pb\n"
	                                             + "d. Fe\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("a")) {
	                                System.out.println("Correct Answer! You have won Rs.5000000\n");
	                                amount = 5000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Au\n"
	                                         + "b. Ag\n"
	                                         + "c. Pb\n"
	                                         + "d. Fe\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("a")) {
	                            System.out.println("Correct Answer! You have won Rs.5000000\n");
	                            amount = 5000000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Au\n"
	                                     + "b. Ag\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("a")) {
	                        System.out.println("Correct Answer! You have won Rs.5000000\n");
	                        amount = 5000000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Au ---> 75%\n"
	                                             + "b. Ag ---> 15%\n"
	                                             + "c. Pb ---> 5%\n"
	                                             + "d. Fe ---> 5%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("a")) {
	                                System.out.println("Correct Answer! You have won Rs.5000000\n");
	                                amount = 5000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Au\n"
	                                             + "b. Ag\n"
	                                             + "c. Pb\n"
	                                             + "d. Fe\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("a")) {
	                                System.out.println("Correct Answer! You have won Rs.5000000\n");
	                                amount = 5000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Au\n"
	                                         + "b. Ag\n"
	                                         + "c. Pb\n"
	                                         + "d. Fe\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("a")) {
	                            System.out.println("Correct Answer! You have won Rs.5000000\n");
	                            amount = 5000000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("a")) {
	            System.out.println("Correct Answer! You have won Rs.5000000\n");
	            amount = 5000000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}
//------------------------------------------------------------------------------------------------------
	
	public boolean question9(String name) {
	    System.out.println("9. What is the largest planet in our solar system?");
	    System.out.println("a. Earth\n"
	                     + "b. Mars\n"
	                     + "c. Jupiter\n"
	                     + "d. Saturn\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Earth ---> 10%\n"
	                                     + "b. Mars ---> 20%\n"
	                                     + "c. Jupiter ---> 60%\n"
	                                     + "d. Saturn ---> 10%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.7500000\n");
	                        amount = 7500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("c. Jupiter\n"
	                                             + "d. Saturn\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.7500000\n");
	                                amount = 7500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Earth\n"
	                                             + "b. Mars\n"
	                                             + "c. Jupiter\n"
	                                             + "d. Saturn\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.7500000\n");
	                                amount = 7500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Earth\n"
	                                         + "b. Mars\n"
	                                         + "c. Jupiter\n"
	                                         + "d. Saturn\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.7500000\n");
	                            amount = 7500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("c. Jupiter\n"
	                                     + "d. Saturn\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("c")) {
	                        System.out.println("Correct Answer! You have won Rs.7500000\n");
	                        amount = 7500000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Earth ---> 10%\n"
	                                             + "b. Mars ---> 20%\n"
	                                             + "c. Jupiter ---> 60%\n"
	                                             + "d. Saturn ---> 10%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.7500000\n");
	                                amount = 7500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Earth\n"
	                                             + "b. Mars\n"
	                                             + "c. Jupiter\n"
	                                             + "d. Saturn\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("c")) {
	                                System.out.println("Correct Answer! You have won Rs.7500000\n");
	                                amount = 7500000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Earth\n"
	                                         + "b. Mars\n"
	                                         + "c. Jupiter\n"
	                                         + "d. Saturn\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("c")) {
	                            System.out.println("Correct Answer! You have won Rs.7500000\n");
	                            amount = 7500000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("c")) {
	            System.out.println("Correct Answer! You have won Rs.7500000\n");
	            amount = 7500000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}
//------------------------------------------------------------------------------------------------------------
	
	public boolean question10(String name) {
	    System.out.println("10. Who wrote the famous play 'Romeo and Juliet'?");
	    System.out.println("a. Charles Dickens\n"
	                     + "b. William Shakespeare\n"
	                     + "c. Mark Twain\n"
	                     + "d. Leo Tolstoy\n"
	                     + "e. Life Line");
	    String res = sc.next();
	    int sel1 = 0;
	    String sel2;
	    if (res.equalsIgnoreCase("e")) {
	        if (life_line_count != 0) {
	            System.out.println("You have the following Life Lines: \n"
	                             + "1. Audience Phone\n"
	                             + "2. 50-50\n");
	            sel1 = sc.nextInt();
	            if (sel1 == 1) {
	                if (aud_phn_cnt != 0) {
	                    aud_phn_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("a. Charles Dickens ---> 10%\n"
	                                     + "b. William Shakespeare ---> 80%\n"
	                                     + "c. Mark Twain ---> 5%\n"
	                                     + "d. Leo Tolstoy ---> 5%\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.10000000\n");
	                        amount = 10000000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "2. 50-50\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (fifty_fifty_cnt != 0) {
	                            fifty_fifty_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("b. William Shakespeare\n"
	                                             + "d. Leo Tolstoy\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.10000000\n");
	                                amount = 10000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Charles Dickens\n"
	                                             + "b. William Shakespeare\n"
	                                             + "c. Mark Twain\n"
	                                             + "d. Leo Tolstoy\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.10000000\n");
	                                amount = 10000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Charles Dickens\n"
	                                         + "b. William Shakespeare\n"
	                                         + "c. Mark Twain\n"
	                                         + "d. Leo Tolstoy\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.10000000\n");
	                            amount = 10000000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            } else if (sel1 == 2) {
	                if (fifty_fifty_cnt != 0) {
	                    fifty_fifty_cnt--;
	                    life_line_count--;
	                    System.out.println("Select your choice: ");
	                    System.out.println("b. William Shakespeare\n"
	                                     + "d. Leo Tolstoy\n");
	                    res = sc.next();
	                    if (res.equalsIgnoreCase("b")) {
	                        System.out.println("Correct Answer! You have won Rs.10000000\n");
	                        amount = 10000000;
	                        return true;
	                    } else {
	                        System.out.println("Wrong Answer. You have completed the game.");
	                        System.out.println("Your take away reward is: " + amount);
	                        return false;
	                    }
	                } else {
	                    System.out.println("You have already used this life line.\n"
	                                     + "Available Life line is: \n"
	                                     + "1. Audience Phone\n"
	                                     + "Do you wish to use it?(y/n)");
	                    sel2 = sc.next();
	                    if (sel2.equalsIgnoreCase("y")) {
	                        if (aud_phn_cnt != 0) {
	                            aud_phn_cnt--;
	                            life_line_count--;
	                            System.out.println("Select your choice: ");
	                            System.out.println("a. Charles Dickens ---> 10%\n"
	                                             + "b. William Shakespeare ---> 80%\n"
	                                             + "c. Mark Twain ---> 5%\n"
	                                             + "d. Leo Tolstoy ---> 5%\n");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.10000000\n");
	                                amount = 10000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        } else {
	                            System.out.println("None of the life lines are available.");
	                            System.out.println("Choose the correct option: ");
	                            System.out.println("a. Charles Dickens\n"
	                                             + "b. William Shakespeare\n"
	                                             + "c. Mark Twain\n"
	                                             + "d. Leo Tolstoy\n"
	                                             + "e. Life Line");
	                            res = sc.next();
	                            if (res.equalsIgnoreCase("b")) {
	                                System.out.println("Correct Answer! You have won Rs.10000000\n");
	                                amount = 10000000;
	                                return true;
	                            } else {
	                                System.out.println("Wrong Answer. You have completed the game.");
	                                System.out.println("Your take away reward is: " + amount);
	                                return false;
	                            }
	                        }
	                    } else {
	                        System.out.println("Choose the correct option: ");
	                        System.out.println("a. Charles Dickens\n"
	                                         + "b. William Shakespeare\n"
	                                         + "c. Mark Twain\n"
	                                         + "d. Leo Tolstoy\n"
	                                         + "e. Life Line");
	                        res = sc.next();
	                        if (res.equalsIgnoreCase("b")) {
	                            System.out.println("Correct Answer! You have won Rs.10000000\n");
	                            amount = 10000000;
	                            return true;
	                        } else {
	                            System.out.println("Wrong Answer. You have completed the game.");
	                            System.out.println("Your take away reward is: " + amount);
	                            return false;
	                        }
	                    }
	                }
	            }
	        }
	    } else {
	        if (res.equalsIgnoreCase("b")) {
	            System.out.println("Correct Answer! You have won Rs.10000000\n");
	            amount = 10000000;
	            return true;
	        } else {
	            System.out.println("Wrong Answer. You have completed the game.");
	            System.out.println("Your take away reward is: " + amount);
	            return false;
	        }
	    }
	    return false;
	}
}