//
//  ViewController.swift
//  Tip-Calculator
//
//  Created by User on 25/07/23.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var amountTextField: UITextField!
    @IBOutlet weak var personsCountTextField: UITextField!
    
    @IBOutlet weak var percentLabel: UILabel!
    @IBOutlet weak var percentSlider: UISlider!
    
    @IBOutlet weak var tipCostLabel: UILabel!
    @IBOutlet weak var totalCostLabel: UILabel!
    @IBOutlet weak var costPerPersonLabel: UILabel!
    
    var foodCost = 0.0
    var tipPrecent = 0.0
    var tipCost = 0.0
    var totalCost = 0.0
    var costPerPerson = 0.0
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func precentSlider(_ sender: UISlider) {
        print(sender.value)
    }
    
    @IBAction func precentButton(_ sender: UIButton) {
        print(sender.titleLabel?.text)
    }
    
    func calculate(){}
    
    func createAMessageWindow(message:String){}
    
    func printUIElements(){}
    
}

