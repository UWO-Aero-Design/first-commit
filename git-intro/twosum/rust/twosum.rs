/*
    To run the code, you must have a rust installed
    Go to: https://www.rust-lang.org/tools/install
    Once installed, open your terminal and type:
        `rustc twosum.rs`
        `./twosum` - Linux or macOS
        `.\twosum.exe` - Windows

    ** Make sure you are in the rust folder so that the
    ** code file can be found.
*/

use std::collections::HashMap;

fn main() {
    // Target number to compute
    let target: i64 = 45;

    // The array of values that can be used
    // Remember, arrays are 0 indexed
    let data: [i64; 30] = [
        7, 2, -3, 48, 5, 6, 46, 8, 19, -10,
        11, 32, 6, 26, 15, -16, 20, 18, 30, 20,
        21, 52, -23, 54, 21, 26, 27, 70, -29, 30
    ];

    match two_sum(&data, target) {
        Some((i, j)) => {
            println!("Value at index {} is {}", i, data[i]);
            println!("Value at index {} is {}", j, data[j]);
            println!("Adds to target {}", target);
        },
        None => println!("No Solution"),
    }

}

fn two_sum(arr: &[i64], target: i64) -> Option<(usize, usize)> {
    let mut values: HashMap<i64, usize> = HashMap::new();

    for (i, curr) in arr.iter().enumerate() {
        let need = target - curr;
        match values.get(&need) {
            Some(x) => { return Some((*x, i)); },
            None => { values.insert(*curr, i); }
        }
    }
    return None;
}