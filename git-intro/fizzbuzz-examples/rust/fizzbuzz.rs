fn main() {
    // The range of numbers we wish to run the exercise on
    let lower: u8 = 1;
    let upper: u8 = 100;

    // The multiples we want print fizz and buzz on
    let fizz: u8 = 7;
    let buzz: u8 = 12;

    for i in lower..=upper {
        match (i % fizz, i % buzz) {
            (0, 0) => println!("fizzbuzz"),
            (0, _x) => println!("fizz"),
            (_x, 0) => println!("buzz"),
            _ => println!("{}", i),
        };
    }
}